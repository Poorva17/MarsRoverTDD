package com.marsrover;

public class Plateau {
    int topRightX;
    int topRightY;
    int bottomLeftX;
    int bottomLeftY;

    public Plateau(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }
}
