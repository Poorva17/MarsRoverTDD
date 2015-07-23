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
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        MarsRover marsRover = (MarsRover) that;
        if (positionX != marsRover.positionX)
            return false;
        if (positionY != marsRover.positionY)
            return false;
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

    public MarsRover move(String navigationInput) {
        for (int index = 0; index < navigationInput.length(); index++) {
            char inputForOneMove = navigationInput.charAt(index);
            switch (inputForOneMove) {
                case 'M':
                    this.moveForward();
                    break;
                case 'L':
                    this.changeDirectionToLeft();
                    break;
                case 'R':
                    this.changeDirectionToRight();
            }
        }
        this.showCurrentPosition();
        return this;
    }

    private void changeDirectionToRight() {
        if (this.direction.equals("N"))
            this.direction = "E";
        else if (this.direction.equals("E"))
            this.direction = "S";
        else if (this.direction.equals("S"))
            this.direction = "W";
        else if (this.direction.equals("W"))
            this.direction = "N";
    }

    private void changeDirectionToLeft() {
        if (this.direction.equals("N"))
            this.direction = "W";
        else if (this.direction.equals("W"))
            this.direction = "S";
        else if (this.direction.equals("S"))
            this.direction = "E";
        else if (this.direction.equals("E"))
            this.direction = "N";
    }

    private void moveForward() {
        if (this.direction.equals("N"))
            this.positionY++;
        else if (this.direction.equals("S"))
            this.positionY--;
        else if (this.direction.equals("E"))
            this.positionX++;
        else if (this.direction.equals("W"))
            this.positionX--;
    }

    public void showCurrentPosition() {
        System.out.print("MarsRover Position :" + positionX + " " + positionY + " " + direction);
    }

}


