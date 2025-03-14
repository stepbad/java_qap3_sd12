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
    }
}