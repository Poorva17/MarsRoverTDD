package com.marsrover;

public class MarsRover {
    private int positionX;
    private int positionY;
    String direction;

    public MarsRover(int positionX, int positionY, char direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = String.valueOf(direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover marsRover = (MarsRover) o;

        if (positionX != marsRover.positionX) return false;
        if (positionY != marsRover.positionY) return false;
        return !(direction != null ? !direction.equals(marsRover.direction) : marsRover.direction != null);

    }

    @Override
    public int hashCode() {
        int result = positionX;
        result = 31 * result + positionY;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    public boolean isValid() {
        Plateau plateau = new Plateau(0, 0, 5, 5);
        return (isInsidePlateau(plateau) && isValidDirection());
    }

    private boolean isValidDirection() {
        if (this.direction.equals("N") || this.direction.equals("S") ||
                this.direction.equals("E") || this.direction.equals("W")) {
            return true;
        }
        return false;
    }

    private boolean isInsidePlateau(Plateau plateau) {
        if ((this.positionX >= plateau.bottomLeftX) &&
                (this.positionX <= plateau.topRightX) &&
                (this.positionY >= plateau.bottomLeftY) &&
                (this.positionY <= plateau.topRightY)) {
            return true;
        }
        return false;
    }
}


