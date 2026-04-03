package problem1;

public class TestShapes {

    public static void main(String[] args) {

        Shape c1 = new Cylinder(3, 5);
        Shape s1 = new Sphere(4);
        Shape cube = new Cube(2);

        System.out.println("Cylinder volume: " + c1.volume());
        System.out.println("Cylinder surface: " + c1.surfaceArea());

        System.out.println("Sphere volume: " + s1.volume());
        System.out.println("Sphere surface: " + s1.surfaceArea());

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface: " + cube.surfaceArea());
    }
}
