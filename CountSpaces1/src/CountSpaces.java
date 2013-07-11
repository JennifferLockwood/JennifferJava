public class CountSpaces
{
    static public void main(String args[]) {
        String aString = "I am John.";
        int spaces = 0;
        for (int i = 0; i < aString.length(); i++) {
            if (aString.charAt(i) == ' ')
                spaces++;
        }

        System.out.println("Spaces = " + spaces);
    }
}
