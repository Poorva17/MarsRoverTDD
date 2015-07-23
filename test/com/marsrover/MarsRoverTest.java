package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void shouldKnowEqualityOfState() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');

        assertEquals(new MarsRover(0, 0, 'N'), marsRover);
    }

    @Test
    public void shouldKnowBoundaryOfPlateau() {
        MarsRover marsRover = new MarsRover(1, 3, 'N');

        boolean actualState = marsRover.isValid();

        assertEquals(true, actualState);
    }

    @Test
    public void shouldKnowInvalidPosition() {
        MarsRover marsRover = new MarsRover(6, 4, 'N');

        boolean actualState = marsRover.isValid();

        assertEquals(false, actualState);
    }

    @Test
    public void shouldHaveValidDirection() {
        MarsRover marsRover = new MarsRover(5, 2, 'P');

        boolean actualState = marsRover.isValid();

        assertEquals(false, actualState);
    }

}



