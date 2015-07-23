package com.marsrover;

public class MarsRover {
    private int positionX;
    private int positionY;
    char direction;

    public MarsRover(int positionX, int positionY, char direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass())
            return false;

        MarsRover marsRover = (MarsRover) that;

        if (positionX != marsRover.positionX)
            return false;
        if (positionY != marsRover.positionY)
            return false;
        return direction == marsRover.direction;
    }

    @Override
    public int hashCode() {
        int result = positionX;
        result = 31 * result + positionY;
        result = 31 * result + (int) direction;
        return result;
    }

    public boolean isInsidePlateau() {
        return true;
    }
}


