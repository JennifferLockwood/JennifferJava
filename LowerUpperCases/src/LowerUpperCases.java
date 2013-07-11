/*
Program converts all lowercase letters to uppercase, and all uppercase
letters to lowercase, displaying the result. At the end, the program
display the total number of case changes.
 */

class LowerUpperCases {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter a period to stop.");

        do{
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Case changes: " + changes);
    }
}
