/*
 This program calculates the volume and area of cones

 */

class Cone {
    int radius;
    int high;

    void volarea() {
        double volume  = radius * radius * 3.14159 * high;
        System.out.println("Volume of the cone is: " + volume);

        double area = 2 * 3.14159 * radius * high;
        System.out.println("Area of the cone is: " + area);
    }
}

class VolumeAreaCone {
    public static void main(String args[]) {
        Cone small = new Cone();
        Cone medium = new Cone();
        Cone large = new Cone();

        // assign values to fields in small
        small.high = 5;
        small.radius = 4;

        // assign values to fields in medium
        medium.high = 15;
        medium.radius = 12;

        // assign values to fields in large
        large.high = 100;
        large.radius = 20;

        small.volarea();

        medium.volarea();

        large.volarea();
    }
}
