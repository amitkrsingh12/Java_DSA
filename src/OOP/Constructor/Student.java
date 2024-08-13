package OOP.Constructor;

public class Student
{
    public String name;
    private int rollNumber;
    public Student(String n,int num)
    {
        name=n;
        rollNumber=num;
    }
    public Student(String n)
    {
        name=n;
    }
    public Student(){
        name="abc";
        rollNumber=10;
    }
    public void print()
    {
        System.out.println(name + " "+rollNumber);
    }
}
