package com.company;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        field.buildField();
        field.printField();

        Player player = new Player(field);
        field.printField();

    }
}
