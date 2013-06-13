// This Try 2-2 item 6: a one and zero table for the logical operators

class LogOneZeroTable {
    public static void main(String args[]) {

        boolean p, q;
        int x, y, z;

        System.out.println("P\tQ\tAND\tOR\t\tXOR\tNOT");

        p = true; q = false;
        x = (char) p;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

    }

}
