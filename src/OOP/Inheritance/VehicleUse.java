package OOP.Inheritance;

public class VehicleUse {
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        v.setColor("Red");
        v.maxSpeed=80;
        v.print();

//        Car c = new Car();
//        c.setColor("Black");
//        c.maxSpeed=100;
//        c.numDoors=4;
        /*
        We have two print function. 1 in Parent Class(Vehicle) and the other in  Child Class(Car)
        So the below c.print() check first in car class, and implements it.
        Function overriding in Java is a feature that allows a subclass to provide a specific
        implementation of a method that is already defined by its superclass. When a method in a
        subclass has the same name,  return type, and parameters as a method in its superclass the
        method in the subclass overrides the one in the superclass.
         */
        Car c = new Car();
        c.setColor("Black");
        c.maxSpeed=50;
        c.numDoors=4;
        c.printMaxSpeed();
        c.print();

    }
}
