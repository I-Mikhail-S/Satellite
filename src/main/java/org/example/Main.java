package org.example;

import org.example.utils.Parser;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        for (int i = 0; i < parser.parse("Ulan-Ude.txt").size()/2; i++) {
            System.out.println(i +" " + parser.getName().get(i)+ " " + parser.getDateStart().get(i)+ " " +parser.getDateEnd().get(i));
        }



    }
}
