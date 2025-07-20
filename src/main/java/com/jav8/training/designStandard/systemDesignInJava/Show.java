package com.jav8.training.designStandard.systemDesignInJava;

import java.util.ArrayList;
import java.util.List;

class Show {
    int showId;
    List<Seat> seats = new ArrayList<>();

    Show(int showId, int totalSeats) {
        this.showId = showId;
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    boolean bookSeat(int seatNumber) {
        Seat seat = seats.get(seatNumber - 1);
        if (!seat.isBooked) {
            seat.isBooked = true;
            System.out.println("Seat " + seatNumber + " booked.");
            return true;
        }
        System.out.println("Seat already booked!");
        return false;
    }
}