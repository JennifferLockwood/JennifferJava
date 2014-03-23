/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 3/9/14
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class caffeinCopyOfRange {
        public static void main(String args[]) {
            char[] copyFrom = { 'd', 'e', 'c', 'a','f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

            char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

            System.out.println(new String(copyTo));
        }
 }
