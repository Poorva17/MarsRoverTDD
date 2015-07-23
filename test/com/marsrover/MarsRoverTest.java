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

        boolean actualState = marsRover.isInsidePlateau();

        assertEquals(true, actualState);
    }
}



