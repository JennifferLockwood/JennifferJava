/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 5/30/13
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 * Demonstrate the for loop.
 *
 * Call this file ForDemo.java.
 */
public class ForDemo {
    public static void main(String args[]){
        int count;

        for(count = 0; count < 5; count = count + 1) // this loops iterates five times
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}
