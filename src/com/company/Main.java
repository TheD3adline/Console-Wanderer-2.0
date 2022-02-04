package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        field.buildField();
        Player player = new Player(field);
        field.printField();
        String input;
        int loop = 1;
        Scanner sc = new Scanner(System.in);

        while(loop == 1) {

            System.out.println("Enter command (w = move forward, a = turn left, d = turn right, x = exit program):");
            input = sc.next();

            switch(input) {
                case "w": player.moveForward(field); break;
                case "a": player.turnLeft(field); break;
                case "d": player.turnRight(field); break;
                case "x": loop = 0; System.out.println("Exiting program"); break;
                default: System.out.println("Invalid input..."); break;
            }

        }

    }

}
