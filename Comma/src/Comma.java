// Use commas in a for statement.

class Comma {
    public static void main(String args[]) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) // Notice the two loop control variables.
            System.out.println("i and j: " + i + " " + j);
    }
}
