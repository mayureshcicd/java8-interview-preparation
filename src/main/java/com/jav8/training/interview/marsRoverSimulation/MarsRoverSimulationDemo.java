package com.jav8.training.interview.marsRoverSimulation;

public class MarsRoverSimulationDemo {
    public static void main(String[] args) {
        Rover rover1 = new Rover(3, 2, Direction.N);
        Rover rover2 = new Rover(4, 2, Direction.S);

        // Commands for both rovers
        String commands1 = "LMRMLMRMLMRMLRM";
        String commands2 = "MRMMRMMMRMMMRMMMMRMMMMR";


        Processor.process(rover1, commands1,rover2 ,commands2);


        commands1="LRM";
        commands2="LRRM";
        rover1 = new Rover(1, 2, Direction.E);
        rover2 = new Rover(0, 2, Direction.S);
        Processor.process(rover1, commands1,rover2 ,commands2);
    }
}
