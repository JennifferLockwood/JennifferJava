/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 5/30/13
 * Time: 5:07 PM
 * To change this template use File | Settings | File Templates.
 * Demonstrate a block code.
 * Call this file BlockDemo.java.
 */
public class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 0;
        j = 10;

        // the target of this if is a blovk
        if(i != 0) {
            System.out.println("i does no equal to zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
