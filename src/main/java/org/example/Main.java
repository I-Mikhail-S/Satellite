package org.example;

import org.example.utils.Parser;
import org.example.utils.ParserSecond;

public class Main {
    public static void main(String[] args) {

        ParserSecond parserSecond = new ParserSecond();
        for (String helpVariable : parserSecond.parse("visible.txt")) {
            if (helpVariable.length() < 6)
                System.out.println(helpVariable);
        }

    }
}