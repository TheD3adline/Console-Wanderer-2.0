package com.company;

public class Player {

    private char[] playerChar;
    private int posRow, posColumn, dir;

    //constructor command to place the player in the field of play
    Player(Field field) {
        playerChar = new char[4];
        playerChar[0] = '^';
        playerChar[1] = '>';
        playerChar[2] = 'v';
        playerChar[3] = '<';
        posRow = 3;
        posColumn = 3;
        dir = 0;
        field.getField()[posRow][posColumn] = playerChar[dir];
    }

    //command to turn the player right
    public void turnRight(Field field) {

        if(dir == 0) {
            dir++;
        } else if(dir == 1) {
            dir++;
        } else if(dir == 2) {
            dir++;
        } else if(dir == 3) {
            dir = 0;
        } else {
            System.out.println("ERROR: Turn right critical error...");
        }

        System.out.println("You turn to the right...");
        System.out.println();
        field.getField()[posRow][posColumn] = playerChar[dir];
        field.printField();

    }

    //command to turn the player left
    public void turnLeft(Field field) {

        if(dir == 0) {
            dir = 3;
        } else if(dir == 3) {
            dir--;
        } else if(dir == 2) {
            dir--;
        } else if(dir == 1) {
            dir--;
        } else {
            System.out.println("ERROR: Turn left critical error...");
        }

        System.out.println("You turn to the left...");
        System.out.println();
        field.getField()[posRow][posColumn] = playerChar[dir];
        field.printField();

    }

}
