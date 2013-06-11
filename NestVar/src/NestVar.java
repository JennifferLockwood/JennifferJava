/* This program attempts to declare a variable in a inner scope
   with the same name as one defined in an outer scope.
 */

class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);

            int difcount; // illegal!!!
            for(difcount = 0; difcount < 2; difcount++)
                System.out.println("This program is in error!");
        }
    }
}
