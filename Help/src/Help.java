/* Try this 3-1.
A simple help system.
 */

class Help {
    public static void main(String args[])
        throws java.io.IOException {
        char choice;

        System.out.println("Help on");
        System.out.println("  A. if");
        System.out.println("  B. switch");
        System.out.println("Choose on: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case 'A':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 'B':
                System.out.println("The switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }
    }
}
