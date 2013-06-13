// Demonstrate automatic conversion from long to double.

class LongtoDouble {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        L = D;  // Illegal!!!

        System.out.println("L and D: " + L + " " + D);

    }
}
