package display;

import java.util.List;
import java.util.Scanner;

public class Display {
    private Scanner input = new Scanner(System.in);

    public void showAvailableMovies(List<String> availableMovies) {
        for (String movie : availableMovies) {
            System.out.println(movie);
        }
    }

    public String getMovieName() {
        System.out.println("Enter the Movie Name");
        return input.nextLine();
    }

    public String getTheatreName() {
        System.out.println("Enter the Theatre Name");
        return input.nextLine();
    }

    public void showTheatres(List<String> theatresForAMovie) {
        for (String theatre : theatresForAMovie) {
            System.out.println(theatre);
        }
    }

    public void showTimings(List<String> timingsForTheTheatre) {
        for (String timings : timingsForTheTheatre) {
            System.out.println(timings);
        }
    }

    public String getTimings() {
        System.out.println("Enter the Timings");
        return input.nextLine();
    }

    public void showAvailableSeats(List<Integer> availableSeats) {
        for (int seat : availableSeats) {
            System.out.print(seat + "\t");
        }
        System.out.println("\n");
    }

    public int getSeatNumber() {
        System.out.println("Enter the seat Number");
        return input.nextInt();
    }

    public String getUserName() {
        System.out.println("Enter the User Name");
        return input.nextLine();
    }

    public void generateTicket(String userName, String movieName, String theatreName, String showTiming, int seatNumber, String paymentId) {
        System.out.println("Person name:\t" + userName);
        System.out.println("Movie name:\t\t" + movieName);
        System.out.println("Theatre name:\t" + theatreName);
        System.out.println("ShowTimings:\t" + showTiming);
        System.out.println("Seat Number:\t" + seatNumber);
        System.out.println("PaymentId:\t\t"+paymentId);
    }

    public String selectAOption() {
        System.out.println("1.Book A Movie\n2.Quit");
        return input.nextLine();
    }

    public Double getMoneyToPay() {
        System.out.println("Enter the money to pay");
        return input.nextDouble();
    }

    public int getCardDetails() {
        return input.nextInt();
    }

    public int getPaymentType() {
        System.out.println("1.Cash\n2.DebitCard");
        return input.nextInt();
    }
}
