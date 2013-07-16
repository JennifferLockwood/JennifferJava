/*
The Factor class defines a method called isFactor() that determines
whether the first parameter is a factor of the second.
 */

class Factor {
    boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        else return false;
    }
}
class IsFactor {
    public static void main(String args[]) {
        Factor x = new Factor();

        if (x.isFactor(2, 20)) System.out.println("2 is factor");
        if (x.isFactor(3, 20)) System.out.println("this won't be displayed");
    }
}
