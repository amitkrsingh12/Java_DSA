package OOP.Inheritance;

public class Vehicle1 {
    private String color;
    public int maxSpeed;
    public Vehicle1(int maxSpeed){
        System.out.println("Vehicle 1 Constructor");
        this.maxSpeed=maxSpeed;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void print(){
        System.out.println("Vehicle " + " color "+ color +" maxSpeed "+maxSpeed);
    }
}
