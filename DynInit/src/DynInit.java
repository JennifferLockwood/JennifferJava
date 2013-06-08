// Demonstrate dynamic initialization.

class DynInit {
    public static void main(String args[]) {
        double radius = 4, height = 5;

        // dynamically initialize volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("The volume of a cylinder is " + volume);
    }
}
