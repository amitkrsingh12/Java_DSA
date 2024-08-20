package OOP.OOP3.Interace;


public class Car extends Vehicle implements CarInterface,VehicleInterface{


    @Override
    public int numgears() {
        return 5;
    }

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
