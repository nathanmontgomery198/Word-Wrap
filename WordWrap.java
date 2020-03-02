package week1;

import java.util.Scanner;


public class WordWrap {

    public static void main(String[] args) {
        // declare/initialise data
        Scanner input = new Scanner(System.in);
        String str;

        // display console prompt
        System.out.println("Enter a single word: ");

        // read user input string - str
        str = input.next();

        // first line - display str
        System.out.println(str);

        // display middle lines
        displayMiddleLines(str);

        // last line - display str in reverse
        displayInReverse(str);
    }

    private static void displayInReverse(String s) {
        // output characters of String s in reverse order
        if (s != null) {
            int length = s.length();
            for (int index = length - 1; index >= 0; index--) {
                System.out.print(s.charAt(index));
            }
            System.out.println();
        }
    }

    private static void displayMiddleLines(String s) {
        // how many lines to display ?
        int numLines = s.length() - 2;

        // use a loop to display one line at a time
        for (int line = 1; line <= numLines; line++) {
            displayOneLine(line, s);
        }

    }

    private static void displayOneLine(int line, String s) {
        if (s != null && line >= 1) {
            // display first character
            System.out.print(s.charAt(line));

            // display spaces
            int numSpaces = s.length() - 2;
            displaySpaces(numSpaces);

            // display last character
            int lastIndex = s.length() - 1;
            int charIndex = lastIndex - line;
            System.out.print(s.charAt(charIndex));

            // take a new line
            System.out.println();
        }
    }

    private static void displaySpaces(int num) {
        for (int count = 0; count < num; count++) {
            System.out.print(" ");
        }
    }

}
