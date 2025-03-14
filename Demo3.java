public class Demo3 {
    public static void main(String[] args) {
        // Create some Ellipse objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Ellipse("Ellipse1", 6.0, 4.0);
        shapes[1] = new Ellipse("Ellipse2", 10.0, 7.0);

        // Loop through the array and print each shape's details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Create Circle objects
        Circle circle1 = new Circle("Circle1", 5.0);
        Circle circle2 = new Circle("Circle2", 7.5);

        // Print each Circle's details
        System.out.println(circle1);
        System.out.println(circle2);

        // Create Triangle objects
        try {
            Triangle triangle1 = new Triangle("Triangle1", 3.0, 4.0, 5.0);
            Triangle triangle2 = new Triangle("Triangle2", 6.0, 8.0, 10.0);

            // Print each Triangle's details
            System.out.println(triangle1);
            System.out.println(triangle2);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // Example of an invalid triangle (will cause an exception)
        try {
            Triangle invalidTriangle = new Triangle("InvalidTriangle", 1.0, 2.0, 10.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Caught an invalid triangle: " + e.getMessage());
        }
    }
}