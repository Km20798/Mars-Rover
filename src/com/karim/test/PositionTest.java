package com.karim.test;

import com.karim.roverMars.Direction;
import com.karim.roverMars.Position;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    private Position position ;

    @Test
    void rotateRight() {
        position = new Position();
        position.init();
        assertEquals(new Position(4,2,Direction.SOUTH) , position.rotateRight());
    }

    @Test
    void rotateLeft() {
        position = new Position();
        position.init();
        assertEquals(new Position(4,2,Direction.NORTH) , position.rotateLeft());
    }

    @Test
    void moveAhead() {
        position = new Position();
        position.init();
        assertEquals(new Position(5,2,Direction.EAST) , position.moveAhead());
    }

    @Test
    void moveBack() {
        position = new Position();
        position.init();
        assertEquals(new Position(3,2,Direction.EAST) , position.moveBack());
    }


}