// package abstraction.shapes;

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
