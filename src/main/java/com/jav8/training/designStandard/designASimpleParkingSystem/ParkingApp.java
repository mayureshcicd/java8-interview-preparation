package com.jav8.training.designStandard.designASimpleParkingSystem;

public class ParkingApp {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(2);
        lot.park(new Vehicle("MH12AB1234"));
        lot.park(new Vehicle("MH12XY5678"));
        lot.park(new Vehicle("MH12ZZ0001")); // Should fail
        lot.leave("MH12XY5678");
        lot.park(new Vehicle("MH12ZZ0001")); // Should succeed now
    }
}
