/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 5/30/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 * Try This 1-2
 * This program displays a conversation table of gallons to liters.
 * Call this program GalToLitTable.java.
 */
public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for( gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; //convert to liters
            System.out.println(gallons + " gallons is " +
            liters + " liters.");

            counter++;
            // every 10th line, print a blank line
            if(counter == 10) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
