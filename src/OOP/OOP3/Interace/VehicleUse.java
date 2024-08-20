package OOP.OOP3.Interace;

public class VehicleUse {
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        VehicleInterface vI = null;
        vI = new Vehicle();
        vI.getCompany();
        vI.isMotorized();

    }
}
