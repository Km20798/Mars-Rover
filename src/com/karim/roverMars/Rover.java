package com.karim.roverMars;

import java.util.InputMismatchException;

public class Rover {

    private Position position;
    private Position currentPosition;

    public Rover() {
        position= new Position();
    }

    public void startTravel(){
        System.out.println("Rovel started its travel from earth!!!");
    }

    public void reachMars(){
        System.out.println("Rovel reached Mars successfully and initialised with coordinates 4,6 in EAST Direction :)");
        this.position.init();
    }


    public Position getPosition() {
        return position;
    }

    public void process(String instructions){
        char[]  chars = instructions.toCharArray();
        for (char c: chars) {
            this.process(c);
        }
    }

    public void process(Character instruction){
        switch (instruction){
            case 'F':
                moveForward();
                break;
            case 'R':
                moveRight();
                break;
            case 'L':
                moveLeft();
                break;
            case 'B':
                moveBackward();
                break;
            default:
                throw new InputMismatchException("Please Input valid Instrctions!!!");
        }
    }


    private void moveForward(){
        if(!checkPoints()) {
            currentPosition = position;
            position = position.moveAhead();
        }else {
            System.out.println("("+currentPosition.getCOORDINATE_X()+","+currentPosition.getCOORDINATE_Y()+") "+currentPosition.getDirection());
            System.out.println("STOPPED");
            System.exit(0);
        }
    }

    private void moveBackward(){
        if(!checkPoints()) {
            currentPosition = position;
            position = position.moveBack();
        }else {
            System.out.println(currentPosition);
            System.out.println("STOPPED");
            System.exit(0);
        }
    }

    private void moveRight(){
        if(!checkPoints()) {
            currentPosition = position;
            position = position.rotateRight();
        }else {
            System.out.println(currentPosition);
            System.out.println("STOPPED");
            System.exit(0);
        }
    }

    private void moveLeft(){
        if(!checkPoints()) {
            currentPosition = position;
            position = position.rotateLeft();
        }else {
            System.out.println(currentPosition);
            System.out.println("STOPPED");
            System.exit(0);
        }
    }

    public boolean checkPoints(){
        Position position = getPosition();
        if((position.getCOORDINATE_X() == 1 && position.getCOORDINATE_Y() == 4) ||
                (position.getCOORDINATE_X() == 3 && position.getCOORDINATE_Y() == 5) ||
                (position.getCOORDINATE_X() == 7 && position.getCOORDINATE_Y() == 4) ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return position.toString();
    }

}
