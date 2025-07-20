package com.jav8.training.interview.marsRoverSimulation;

public enum Direction {
    N,E,S,W;

    private static final Direction[] left={W,N,E,S};
    private static final Direction[] right={E,S,W,N};
    public Direction  leftTurn()
    {
        return  left[this.ordinal()];
    }
    public  Direction rightTurn()
    {
        return right[this.ordinal()];
    }

}
