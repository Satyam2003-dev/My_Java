public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    } 

    public static void main(String[] args) {
        // Create an instance of Rectangle using the parameterized constructor
        Rectangle rectangle = new Rectangle(5, 3);
        
        // Calculate and print the perimeter and area
        double perimeter = rectangle.calculatePerimeter();
        double area = rectangle.calculateArea();
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
  