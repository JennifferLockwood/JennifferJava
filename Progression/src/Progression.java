/*
Use a for loop to generate and display the progression
1, 2, 4, 8, 16, and so on.
 */

class Progression {
    public static void main(String args[]) {

        for (int i =1; i < 100; i+= i)
        System.out.print(i + " ");
        System.out.println();
    }
}
