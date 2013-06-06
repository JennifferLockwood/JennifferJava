/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 6/5/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 * This program computes the distance to a lighting strike whose
 * sound takes 7.2 seconds to reach you.
 */
public class Sound {
    public static void main(String args[]) {
        double dist, feet, seconds;

        for(seconds = 1; seconds <=10; seconds++) {
            feet = seconds * 1100;
            dist = feet / (39.37/12);

            System.out.println("The lighting is " + dist + " meters away after " + seconds + " seconds.");
        }

    }
}
