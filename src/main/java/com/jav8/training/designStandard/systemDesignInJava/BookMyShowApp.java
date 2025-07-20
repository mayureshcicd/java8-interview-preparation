package com.jav8.training.designStandard.systemDesignInJava;

public class BookMyShowApp {
    /*
    * Q1: Design "Book My Show"-style Ticket Booking System (Basic Version)
      Goal: Handle seats, users, booking.
    * */
    public static void main(String[] args) {
        Show show = new Show(101, 10);
        show.bookSeat(3); // Seat 3 booked
        show.bookSeat(3); // Already booked
    }
}