package com.jav8.training.interview.marsRoverSimulation;

public class Processor {
    private static boolean compare(Rover r1, Rover r2) {
        return r1.x == r2.x && r1.y == r2.y;
    }

    public static void process(Rover r1, String commands1, Rover r2, String commands2) {
        boolean result = false;
        int length = Math.max(commands1.length(), commands2.length());
        for (int i = 0; i < length; i++) {
            if(i<commands1.length())
            {
                r1.execute(commands1.charAt(i));
            }
            if (i<commands2.length())
            {
                r2.execute(commands2.charAt(i));
            }
            if(compare(r1, r2))
            {
                System.out.println("Rover  collide "+r1.getPosition());
                result=true;
                break;
            }
        }
        if (!result)
        {
            System.out.println("Rover not collide ");
            System.out.println("Rover  collide "+r1.getPosition());
            System.out.println("Rover  collide "+r2.getPosition());
        }
    }
}
