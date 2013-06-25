// Infinite loop by leaving the conditional expression empty.

class Empty3 {
    public static void main(String args[]) {
        int i;

        i = 0;
        for (;;) {
            System.out.println("Pass #" + i);
            i++;
        }
    }
}
