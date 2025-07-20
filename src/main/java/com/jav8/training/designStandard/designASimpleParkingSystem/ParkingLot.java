package com.jav8.training.designStandard.designASimpleParkingSystem;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    int capacity;
    List<Vehicle> slots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.slots = new ArrayList<>();
    }

    public boolean park(Vehicle v) {
        if (slots.size() < capacity) {
            slots.add(v);
            System.out.println("Parked: " + v.number);
            return true;
        }
        System.out.println("Full! Cannot park: " + v.number);
        return false;
    }

    public boolean leave(String number) {
        for (Vehicle v : slots) {
            if (v.number.equals(number)) {
                slots.remove(v);
                System.out.println("Left: " + number);
                return true;
            }
        }
        System.out.println("Vehicle not found: " + number);
        return false;
    }
}