public class Circle {

  static double radius = 1;
  static double diameter = 2 * radius;
  static double area = Math.PI * radius * radius;

  public Circle() {
    diameter = 2 * radius;
    area = Math.PI * radius * radius;
  }

  public static void setRadius(double rad) {
    radius = rad;
    diameter = 2 * radius;
    area = Math.PI * radius * radius;
  }

  public static double getRadius() {
    return radius;
  }

  public static double getDiameter() {
    return diameter;
  }

  public static double getArea() {
    return area;
  }
}
