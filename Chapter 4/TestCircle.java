class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(20.0);

        System.out.println("Radius of the first circle: " + circle1.getRadius());
        System.out.println("Diameter of the first circle: " + circle1.getDiameter());
        System.out.println("Area of the first circle: " + circle1.getArea());

        System.out.println("Radius of the second circle: " + circle2.getRadius());
        System.out.println("Diameter of the second circle: " + circle2.getDiameter());
        System.out.println("Area of the second circle: " + circle2.getArea());
    }
}
