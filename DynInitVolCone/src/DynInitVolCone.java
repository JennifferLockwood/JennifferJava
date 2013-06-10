/*This program computes the volume of a cone given
the radius of its base and its height.
 */

class DynInitVolCone  {
    public static void main(String args[]) {
        double radius = 5, height = 7;

        // dynamically initialize volume
        double volume = 3.1416 * radius * radius * height * 1 / 3;

        System.out.println("Volume is " + volume);
    }
}
