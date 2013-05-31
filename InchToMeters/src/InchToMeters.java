/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 5/31/13
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class InchToMeters {
    public static void main(String args[]) {
        double inches, meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 144; inches++) {
            meters = inches * 39.37; // convert inches to meters
            System.out.println(inches + " inches is " + meters + " meters.");

            counter ++;
            // every 12th line, print a blank line
            if(counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
