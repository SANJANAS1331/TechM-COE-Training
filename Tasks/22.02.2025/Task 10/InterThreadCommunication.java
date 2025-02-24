package org.example;
class TicketCounter {
    private int availableSeats = 1;
    synchronized void bookTicket(String name, int seatsRequested) {
        System.out.println(name + " is trying to book " + seatsRequested + " ticket(s)...");
        if (availableSeats < seatsRequested) {
            System.out.println("Not enough seats available. " + name + " is waiting...");
            try {wait();} catch (Exception e) {}
        }
        availableSeats -= seatsRequested;
        System.out.println(name + " successfully booked " + seatsRequested + " ticket(s)!");
    }
    synchronized void addSeats(int seats) {
        System.out.println("Adding " + seats + " more seats...");
        availableSeats += seats;
        System.out.println("Seats added successfully!");
        notify();
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        TicketCounter t = new TicketCounter();
        new Thread(() -> t.bookTicket("xxxx", 4)).start();
        new Thread(() -> t.addSeats(1)).start();
    }
}