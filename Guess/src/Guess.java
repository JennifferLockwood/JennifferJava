// Guess the letter game.

import java.io.IOException;

class Guess {
    public static void main(String args[])
        throws IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // Read a char from the keyboard

        if(ch == answer) System.out.println("** Right **");
    }
}
