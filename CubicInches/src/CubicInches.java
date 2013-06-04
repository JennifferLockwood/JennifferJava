/**
 * Created with IntelliJ IDEA.
 * User: Johnniffer
 * Date: 6/3/13
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 * This program computes de number of cubic inches
 * in one cubic mile.
 */
public class CubicInches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im *im;

        System.out.println("There are " + ci +
                           " cubic inches in one cubic mile.");

    }
}
