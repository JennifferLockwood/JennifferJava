/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 3/9/14
 * Time: 8:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Caffein {
    public static void main(String args[]) {
        char[] copyFrom = { 'd', 'e', 'c', 'a','f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
