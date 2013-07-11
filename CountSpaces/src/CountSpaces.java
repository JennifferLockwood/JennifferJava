// Count spaces.

class CountSpaces {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");
        do{
            ch = (char) System.in.read(); // get a char
            if (ch == ' ')
                spaces++;
            } while (ch != '.');
        System.out.println(" Number of spaces: " + spaces);
        }
    }
