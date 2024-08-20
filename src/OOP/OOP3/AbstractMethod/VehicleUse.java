package OOP.OOP3.AbstractMethod;

public class VehicleUse {
    public static void main(String args[])
    {
        Vehicle v;
        Car c = new Car();
        v = new Car();
        v.print();
        System.out.println(c.isMotorized());
    }
}
