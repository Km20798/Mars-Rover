package com.karim.roverMars;

import java.util.Scanner;

public class Mars_Rover {

    public static void main(String[] args) {

        Rover rover = new Rover();
        System.out.println("-------------Welcome in Rover Mars Application-----------");
        rover.startTravel();
        rover.reachMars();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------Welcome in Mars planet-----------");
        System.out.println("Please Insert Your Instructions like this LFRFLFLBF ");
        String order = scanner.nextLine();
        rover.process(order.toUpperCase());
        System.out.println("(" + rover.getPosition().getCOORDINATE_X()
                + "," + rover.getPosition().getCOORDINATE_Y() + ") "
                + rover.getPosition().getDirection() );

    }
}


/*
* it is a java application used to explores Mars by sending remotely controlled vehicles to the surface of the planet

A rover is to be landed on Mars.once it touch the surface of Mars it will be in Coordinates (4,2) EAST .

you can use this application by sending some instructions to rover and it will return the Coordinates of it's palce . theinstruction you will send will be like this FLFFFRFLB F -> mean forword B -> mean Backword R -> mean Rotate right L -> mean Rotate left

for example Input -> FLFFFRFLB output -> (6,4) NORTH

there are some obstacles in Mars it's found in coordinates [[1,4], [3,5], [7,4]] if rover want to move after this obstacles it will return the final coordinates before obstacles

for example input -> LFFFLFF output -> (4,5) WEST STOPPED
* */