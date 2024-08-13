package OOP.Constructor;

public class Student
{
    public String name;
    double cgpa;
    final private int rollNumber;
    final double conversionFactor =0.95;
    static int numStudents;
    public Student(String name,int rollNumber)
    {
        this.name=name;
        numStudents++;
        this.rollNumber=numStudents;
    }
//    public Student(String n)
//    {
//        name=n;
//    }
    public Student(){
        name="abc";
        numStudents++;
        rollNumber=numStudents;
    }
    public void print()
    {
        System.out.println(name + " "+rollNumber);
    }
}
