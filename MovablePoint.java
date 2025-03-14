public class MovablePoint extends Point {
    // Additional instance variables
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // No-argument constructor
    public MovablePoint() {}

    // Constructor with all parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with speed parameters only
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters and setters for speed
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Get both xSpeed and ySpeed as a float array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move method
    public MovablePoint move() {
        // Update x and y using their getters and setters
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // Override toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", speed=(" + xSpeed + ", " + ySpeed + "))";
    }
}
