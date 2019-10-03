package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {
    @Test
    void expect(){
        Ticket ticket=new Ticket();
        ticket.generateTicket("Mithil","Sahoo","Asian","11:00PM","123");
        assertEquals("Ticket\nuserName:\t\tMithil\n" +
                "movieName:\t\tSahoo\n" +
                "theatreName:\tAsian\n" +
                "paymentId:\t\t123\n" +
                "showTiming:\t\t11:00PM\n" +
                "ticketId:\t\tMithil123Asian\n",ticket.toString());
    }
}
