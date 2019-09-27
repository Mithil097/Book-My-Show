package model;

public class Show {
    private final String time;
    private final int numberOfSeats;

    public Show(String time) {
        this.time = time;
        this.numberOfSeats=100;
    }

    public String getShowTime() {
        return this.time;
    }
}
