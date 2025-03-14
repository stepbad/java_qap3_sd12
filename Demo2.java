public class Demo2 {
    public static void main(String[] args) {
        // Testing Point
        Point point = new Point(1.5f, 2.5f);
        System.out.println("Point: " + point);
        point.setXY(4.0f, 6.0f);
        System.out.println("Updated Point: " + point);
    }
}