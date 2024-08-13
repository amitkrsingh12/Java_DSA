package OOP.Constructor;

public class Student
{
    public String name;
    double cgpa;
    final private int rollNumber;
    final double conversionFactor =0.95;
    public Student(String name,int rollNumber)
    {
        this.name=name;
        this.rollNumber=rollNumber;
    }
//    public Student(String n)
//    {
//        name=n;
//    }
//    public Student(){
//        name="abc";
//        rollNumber=10;
//    }
    public void print()
    {
        System.out.println(name + " "+rollNumber);
    }
}
