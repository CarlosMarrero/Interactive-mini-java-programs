package CheckWords;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {
        int num = 1;
        while (num == 1) {	// this loop makes my program rerun until quit is typed
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a word to be checked: ");
            String word = keyboard.next();
            if (word.equalsIgnoreCase("quit")) {
                System.exit(0);
            } else {
                int length = word.length();
                String newWord = word.substring(1, length), backWards = newWord + word.substring(0, 1);
                if (word.indexOf(0) == backWards.indexOf(length)//CANT SEEM TO FIND A WAY TO COMPARE WORDS :-(
                        && word.indexOf(2) == backWards.indexOf(length - 2)) {
                    System.out.println("The word you typed is '" + word + "' this word can be spelled backwards\n "
                            + "with the first letter at the end like so " + (backWards.toLowerCase()));
                } else {
                    System.out.println("The word you typed is '" + word + "' this word can not be spelled backwards\n "
                            + "with the first letter at the end like so " + (backWards.toLowerCase()));
                }
            }
        }
    }
}
