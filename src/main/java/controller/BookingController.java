package controller;

import Theatres.TheatreNotAvailableException;
import display.Display;
import model.Show;
import movies.MovieNotAvailableException;
import services.Booking;
import services.MoneyNotCorrectException;
import services.Payment;
import services.PaymentHandler;

public class BookingController {

    private final Booking booking;
    private final Display display;
    private Payment payment = new PaymentHandler();

    public BookingController(Booking booking, Display display) {
        this.booking = booking;
        this.display = display;
    }

    public void menu() throws MovieNotAvailableException, TheatreNotAvailableException, MoneyNotCorrectException {
        String option = display.selectAOption();
        switch (option) {
            case "1":
                run();
                menu();
            case "2":
                break;
            default:
                menu();
        }

    }

    public void run() throws MovieNotAvailableException, TheatreNotAvailableException, MoneyNotCorrectException {
        display.showAvailableMovies(booking.getAvailableMovies());
        String movieName = display.getMovieName();
        display.showTheatres(booking.getTheatresForAMovie(movieName));
        String theatreName = display.getTheatreName();
        display.showTimings(booking.getTimingsForTheTheatre(theatreName));
        String showTiming = display.getTimings();
        Show show = booking.getShow(theatreName, showTiming);
        String userName = display.getUserName();
        display.showAvailableSeats(booking.getAvailableSeats(show));
        int seatNumber = display.getSeatNumber();
        Double money = display.getMoneyToPay();
        booking.bookASeat(show, seatNumber);
        int paymentType = display.getPaymentType();
        String paymentId = pay(paymentType, money);
        display.generateTicket(userName, movieName, theatreName, showTiming, seatNumber,paymentId);
    }

    private String pay(int paymentType, Double money) throws MoneyNotCorrectException {
        String id;
        switch (paymentType) {
            case 1:
                id = payment.cash(money);
                break;
            case 2:
                int card = display.getCardDetails();
                id = payment.debitCard(card, money);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + paymentType);
        }
        return id;
    }
}
