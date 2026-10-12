public class RectangleMain { public static void main(String[] args) { Rectangle r = new Rectangle(8, 4.5); System.out.println("Area: " + r.getArea()); } }
class Shape { double getArea() { return 0; } }
class Rectangle extends Shape { private double length, width; Rectangle(double length, double width) { this.length=length; this.width=width; } @Override double getArea() { return length*width; } }
