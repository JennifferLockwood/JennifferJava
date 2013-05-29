/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 5/28/13
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 * Try This 1-1
 *
 * This program converts gallons to liters.
 *
 * Call this program GalToLit.java
 */
public class GalToLit {
    public static void main(String args[]) {
        double gallons; // holds the number of gallons
        double liters; // holds the number of liters

        gallons = 10; // start with 10 gallons

        liters = gallons * 3.7854; // convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
