/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 1/29/14
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
// Demonstrate the bitwise NOT.
public class NotDemo {
    public static void main(String args[]) {
        byte b = -34;

        for (int t=128; t > 0; t = t/2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        // reverse all bits
        b = (byte) ~b;

        for (int t=128; t > 0; t = t/2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
