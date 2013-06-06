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
        double dist, seconds;

        for(seconds = 1; seconds <=10; seconds++) {
            dist = seconds * 1100;

            System.out.println("The lighting is " + dist + " feet away after " + seconds + " seconds.");
        }

    }
}
