

class Vehicle {

    private String color;
    private int mileage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

class Car extends Vehicle {

    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

class Coupe extends Car {

    public Coupe() {
        setDoors(2);
    }
}

public class Garage {

    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("red");

        System.out.println(
                String.format("My car is %s and has %d doors.",
                        myCar.getColor(), myCar.getDoors())
        );
    }
}
