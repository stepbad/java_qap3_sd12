public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double computePerimeter();
    public abstract double computeArea();

    @Override
    public String toString() {
        return name + " - Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
