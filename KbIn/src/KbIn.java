// Read a character from the keyboard.

class KbIn {
    public static void main(String args[])
        throws java.io.IOException {

            char ch;

            System.out.println("Press a key followed by ENTER: ");

            ch = (char) System.in.read(); // get a char, read a character from the keyboard

            System.out.println("Your hey is: " + ch);

    }
}
