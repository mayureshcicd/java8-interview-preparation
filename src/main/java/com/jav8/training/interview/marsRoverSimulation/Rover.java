package com.jav8.training.interview.marsRoverSimulation;

public class Rover {
    int x;
    int y;
    Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public void execute(Character pos) {
        if (pos == 'L') {
            direction = direction.leftTurn();
        }
        else if (pos == 'R') {
            direction = direction.rightTurn();
        }
        else if (pos== 'M')
        {
            move();
        }

    }
    public  void move()
    {
        switch (direction)
        {
            case N:y++;break;
            case S:y--;break;
            case E:x++;break;
            case W:x--;break;
        }
    }

    public String getPosition() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }


}
