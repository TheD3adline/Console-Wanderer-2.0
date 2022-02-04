package com.company;

public class Player {

    private char[] playerChar;
    private int posRow, posColumn, dir;

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

}
