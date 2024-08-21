package OOP.OOP3.Interace;

public class VehicleUse {
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        VehicleInterface vI;
        //the below line throws error because now vehicle class does not implement Vehicle interface @1
       // vI =  new Vehicle();
        v.print();
        //vI.getCompany();
       // vI.isMotorized();

    }
}
