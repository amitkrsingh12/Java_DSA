package OOP.OOP3.Interace;

public class Vehicle implements VehicleInterface {

    @Override
    public boolean isMotorized() {
        return true;
    }

    @Override
    public String getCompany() {
        return null;
    }
    void print(){
        System.out.println(PI);
    }
}
