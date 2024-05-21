public class overidingandoverloading {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);
        rectangle.print();
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);  // In a square, length is the side length
        square.print("square");
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}

class Rectangle {

    protected double length;
    protected double width;
    protected double sides = 4;

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

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public void print() {
        System.out.println("I am a rectangle");
    }
}

class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
