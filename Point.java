public class Point {
    // Private instance variables
    private float x = 0.0f;
    private float y = 0.0f;

    // No-argument constructor
    public Point() {}

    // Constructor with two parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Get both x and y as a float array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Override toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
