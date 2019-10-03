package model;

import services.MoneyNotCorrectException;
import services.Payment;
import services.PaymentHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private final String time;
    private final int numberOfSeats;
    private List<Integer> availableSeats = new ArrayList<>();

    public Show(String time) {
        this.time = time;
        this.numberOfSeats = 10;
        for (int i = 1; i <= numberOfSeats; i++) {
            availableSeats.add(i);
        }
    }

    public String getShowTime() {
        return this.time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return numberOfSeats == show.numberOfSeats &&
                Objects.equals(time, show.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, numberOfSeats);
    }

    public List<Integer> getAvailableSeats() {
        return availableSeats;
    }

    public void bookTheSeat(int seatNumber) throws SeatNotAvailableException {
        if (!availableSeats.contains(seatNumber)){
            throw new SeatNotAvailableException("Seat is not available");
        }
        availableSeats.remove(Integer.valueOf(seatNumber));
    }
}
