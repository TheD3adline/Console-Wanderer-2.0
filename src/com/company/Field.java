package com.company;

public class Field {

    private char[][] field;

    Field() {
        field = new char[10][10];
    }

    //build command
    public void buildField(){

        //builds the boundaries on the left and right sides
        for(int i = 0; i < field.length; i++) {
            field[i][0] = '#';
            field[i][9] = '#';
            for(int j = 1; j < (field.length - 1); j++) {
                field[i][j] = ' ';
            }
        }

        //builds the boundary on the upper side
        for(int i = 0; i < field[0].length; i++) {
            if(i > 0 && i < (field[0].length - 1)) {
                field[0][i] = '#';
            }
        }

        //builds the boundary on the lower side
        for(int i = 0; i < field[9].length; i++) {
            if(i > 0 && i < (field[9].length - 1)) {
                field[9][i] = '#';
            }
        }

    }

    //print to console command
    public void printField() {

        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }

}
