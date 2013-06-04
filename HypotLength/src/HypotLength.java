/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 6/3/13
 * Time: 5:56 PM
 * To change this template use File | Settings | File Templates.
 * This program uses the Pythagorean theorem to find the length
 * of the hypotenuse given the lengths of the two opposing sides.
 */
public class HypotLength {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);
    }
}
