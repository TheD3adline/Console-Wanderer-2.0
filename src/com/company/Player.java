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
            System.out.println("You turn to the right...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 1) {
            dir++;
            System.out.println("You turn to the right...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 2) {
            dir++;
            System.out.println("You turn to the right...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 3) {
            dir = 0;
            System.out.println("You turn to the right...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else {
            System.out.println("ERROR: Turn right error...");
        }

    }

    //command to turn the player left
    public void turnLeft(Field field) {

        if(dir == 0) {
            dir = 3;
            System.out.println("You turn to the left...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 3) {
            dir--;
            System.out.println("You turn to the left...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 2) {
            dir--;
            System.out.println("You turn to the left...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 1) {
            dir--;
            System.out.println("You turn to the left...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else {
            System.out.println("ERROR: Turn left error...");
        }

    }

    //command to move the player forward
    public void moveForward(Field field) {

        if(dir == 0 && field.getField()[posRow - 1][posColumn] != '#') {
            field.getField()[posRow][posColumn] = ' ';
            field.getField()[posRow - 1][posColumn] = playerChar[dir];
            posRow--;
            System.out.println("You move forward...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 1 && field.getField()[posRow][posColumn + 1] != '#') {
            field.getField()[posRow][posColumn] = ' ';
            field.getField()[posRow][posColumn + 1] = playerChar[dir];
            posColumn++;
            System.out.println("You move forward...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 2 && field.getField()[posRow + 1][posColumn] != '#') {
            field.getField()[posRow][posColumn] = ' ';
            field.getField()[posRow + 1][posColumn] = playerChar[dir];
            posRow++;
            System.out.println("You move forward...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else if(dir == 3 && field.getField()[posRow][posColumn - 1] != '#') {
            field.getField()[posRow][posColumn] = ' ';
            field.getField()[posRow][posColumn - 1] = playerChar[dir];
            posColumn--;
            System.out.println("You move forward...");
            System.out.println();
            field.getField()[posRow][posColumn] = playerChar[dir];
            field.printField();
        } else {
            System.out.println("There is a wall in front of you...");
        }

    }

}
