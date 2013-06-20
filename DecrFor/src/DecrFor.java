// A negatively running loop.

class DecrFor {
    public static void main(String args[]) {
        int x;

        for (x = 100; x> -100; x -= 5) // Loop control variable is decremented by 5 each time.
          System.out.println(x);

    }
}
