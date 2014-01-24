/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 1/23/14
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */

// Use a string to control a switch statement.

public class StringSwitch {
    public static void main(String main[]) {

        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command Error!");
                break;
        }
    }
}
