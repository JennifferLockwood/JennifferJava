/*
 This program calculates the volume and area of cones

 */

class Cone {
    int radius;
    int high;

    Cone (int r, int h) {
        radius = r;
        high = h;
    }

    void volarea() {
        double volume  = radius * radius * 3.14159 * high;
        System.out.println("Volume of the cone is: " + volume);

        double area = 2 * 3.14159 * radius * high;
        System.out.println("Area of the cone is: " + area);
    }
}

class VolumeAreaCone {
    public static void main(String args[]) {
        Cone small = new Cone(4, 5);
        Cone medium = new Cone(12, 15);
        Cone large = new Cone(100, 20);

        small.volarea();

        medium.volarea();

        large.volarea();
    }
}
