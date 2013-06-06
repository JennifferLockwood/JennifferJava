/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 6/5/13
 * Time: 6:16 PM
 * To change this template use File | Settings | File Templates.
 * This program computes the distance to a large object by timing the echo.
 * Time interval is 2.5 seconds.
 */
public class DistToLargeObject {
    public static void main(String args[]) {
        double dist, dist2;

        dist = 2.5 * 1100;
        dist2 = dist / 2;

        System.out.println("The large object is " + dist2 + "feet away.");
    }
}
