package model;

import java.util.HashMap;

public class Ticket {
    private String movieName;
    private String theatreName;
    private String paymentId;
    private String showTiming;
    private String userName;
    private String ticketId;

    public void generateTicket(String userName, String movieName, String theatreName, String showTiming, String paymentId) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.showTiming = showTiming;
        this.paymentId = paymentId;
        this.userName = userName;
        ticketId=userName.concat(paymentId).concat(theatreName);
    }

    @Override
    public String toString() {
        return "Ticket\n" +
                "userName:\t\t" + userName + '\n' +
                "movieName:\t\t" + movieName + '\n' +
                "theatreName:\t" + theatreName + '\n' +
                "paymentId:\t\t" + paymentId + '\n' +
                "showTiming:\t\t" + showTiming + '\n' +
                "ticketId:\t\t" + ticketId + '\n';
    }
}
