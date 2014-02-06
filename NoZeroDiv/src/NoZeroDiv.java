/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 2/6/14
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
// Prevent a
public class NoZeroDiv {
    public static void main(String args[]) {
        int result;

        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;      // This prevents a divide-by-zero.
            if (i != 0)
                System.out.println("100 / " + i + " is " + result);
        }
    }
}
