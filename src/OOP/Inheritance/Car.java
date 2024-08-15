package OOP.Inheritance;

public class Car extends Vehicle {
    int numDoors;
    int maxSpeed;
    public void print(){
        super.print();
        System.out.println("Car "+" numDoors : "+numDoors);
    }
    public void printMaxSpeed(){
        super.maxSpeed=150;
        System.out.println(maxSpeed + " " +super.maxSpeed);
    }
}
