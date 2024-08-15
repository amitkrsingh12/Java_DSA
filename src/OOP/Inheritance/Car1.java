package OOP.Inheritance;

public class Car1 extends Vehicle1 {
    int numDoors;

    int maxSpeed;
    public Car1(int numDoors,int maxSpeed) {
        super(maxSpeed);
        System.out.println("Car 1 Constructor");
        this.numDoors=numDoors;
    }

    public void print() {
        super.print();
        System.out.println("Car " + " numdoors " + numDoors);
    }

    public void printMaxspeed() {
        super.maxSpeed = 15;
        System.out.println(maxSpeed + " " + super.maxSpeed);
    }
}
