package com.karim.roverMars;

import java.util.InputMismatchException;

public class Position {

    private int COORDINATE_X;
    private int COORDINATE_Y;
    private Direction direction;

    public Position(int COORDINATE_X, int COORDINATE_Y, Direction direction) {
        this.COORDINATE_X = COORDINATE_X;
        this.COORDINATE_Y = COORDINATE_Y;
        this.direction = direction;
    }

    public Position() {

    }

    public int getCOORDINATE_X() {
        return COORDINATE_X;
    }

    public void setCOORDINATE_X(int COORDINATE_X) {
        this.COORDINATE_X = COORDINATE_X;
    }

    public int getCOORDINATE_Y() {
        return COORDINATE_Y;
    }

    public void setCOORDINATE_Y(int COORDINATE_Y) {
        this.COORDINATE_Y = COORDINATE_Y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void init() {
        this.COORDINATE_X = 4;
        this.COORDINATE_Y = 2;
        this.direction= Direction.EAST;
    }

    public Position rotateRight(){
        return new Position(COORDINATE_X , COORDINATE_Y , direction.right());
    }

    public Position rotateLeft(){
        return new Position(COORDINATE_X , COORDINATE_Y , direction.left());
    }

    public Position moveAhead(){
        switch (direction.toString()){
            case "EAST":
                return new Position(COORDINATE_X+1 , COORDINATE_Y , direction);
            case "WEST":
                return new Position(COORDINATE_X-1 , COORDINATE_Y , direction);
            case "NORTH":
                return new Position(COORDINATE_X , COORDINATE_Y+1 , direction);
            case "SOUTH":
                return new Position(COORDINATE_X , COORDINATE_Y-1 , direction);
            default:
                throw new InputMismatchException("please Input valid Direction!!!");
        }
    }

    public Position moveBack(){
        switch (direction.toString()){
            case "EAST":
                return new Position(COORDINATE_X-1 , COORDINATE_Y , direction);
            case "WEST":
                return new Position(COORDINATE_X+1 , COORDINATE_Y , direction);
            case "NORTH":
                return new Position(COORDINATE_X , COORDINATE_Y-1 , direction);
            case "SOUTH":
                return new Position(COORDINATE_X , COORDINATE_Y+1 , direction);
            default:
                throw new InputMismatchException("please Input valid Direction!!!");
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "COORDINATE_X=" + COORDINATE_X +
                ", COORDINATE_Y=" + COORDINATE_Y +
                ", direction=" + direction +
                '}';
    }


}
