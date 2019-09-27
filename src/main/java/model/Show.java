package model;

import java.util.Objects;

public class Show {
    private final String time;
    private final int numberOfSeats;

    public Show(String time) {
        this.time = time;
        this.numberOfSeats = 100;
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
}
