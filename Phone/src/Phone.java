/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 1/23/14
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */

// A simple automated telephone directory.
public class Phone {
    public static void main(String args[]) {
        String numbers[] [] = {
                { "Tom", "555-3322"},
                { "Mary", "555-8976"},
                { "Jon", "555-1037"},
                { "Rachel", "555-1400"}
        };
        int i;

        if (args.length != 1)       //To use the program, one command-line argument must be present.
            System.out.println("Usage: java Phone <name>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers [i][0]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Name not found.");
        }
    }
}
