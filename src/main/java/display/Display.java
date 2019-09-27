package display;

import java.util.List;
import java.util.Scanner;

public class Display {
    Scanner input=new Scanner(System.in);
    public void showAvailableMovies(List<String> availableMovies) {
        for (String movie:availableMovies){
            System.out.println(movie);
        }
    }

    public String getMovieName() {
        return input.nextLine();
    }

    public String getTheatreName() {
        return input.nextLine();
    }

    public void showTheatres(List<String> theatresForAMovie) {
        for (String theatre:theatresForAMovie){
            System.out.println(theatre);
        }
    }

    public void showTimings(List<String> timingsForTheTheatre) {
        for (String timings:timingsForTheTheatre){
            System.out.println(timings);
        }
    }

    public String getTimings() {
        return input.nextLine();
    }

    public void showAvailableSeats(List<Integer> availableSeats) {
        for (int seat:availableSeats){
            System.out.print(seat+"\t");
        }
        System.out.println("\n");
    }

    public int getSeatNumber() {
        return input.nextInt();
    }

    public String getUserName() {
        return input.nextLine();
    }

    public void generateTicket(String userName, String movieName, String theatreName, String showTiming, int seatNumber) {
        System.out.println("Person name\t"+userName);
        System.out.println("Movie name\t"+movieName);
        System.out.println("Theatre name\t"+theatreName);
        System.out.println("ShowTimings\t"+showTiming);
        System.out.println("Seat Number:\t"+seatNumber);

    }

}
