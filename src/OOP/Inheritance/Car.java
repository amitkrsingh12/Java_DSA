package OOP.Inheritance;

public class Car extends Vehicle {
    int numDoors;
    public void printCar(){
        System.out.println("Car "+ "color : "+getColor()+ " maxSpeed "+ maxSpeed +" numDoors : "+numDoors);
    }
}
