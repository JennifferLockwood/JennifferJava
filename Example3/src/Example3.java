/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 5/28/13
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 * This program illustrates the differences between int and double.
 *
 * Call this file Example3.java
 */
public class Example3 {
    public static void main(String args[]) {
        int var; // this declares an int
        double x; // this declares a floating-point variable

        var = 10; // assign var the value 10
        x = 10.0; // assign x the value 10.0

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // Print a blank line

        // now, divide both by 4
        var = var / 4;
        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}
