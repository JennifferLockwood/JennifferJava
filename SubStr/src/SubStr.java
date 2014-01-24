/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 1/23/14
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */

// Use substring().
public class SubStr {
    public static void main(String args[]) {
        String orgstr = "Java makes the Web move.";

        // construct a substring
        String substr = orgstr.substring( 5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
