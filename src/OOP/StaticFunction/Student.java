package OOP.StaticFunction;

public class Student
{
    public String name;
    final private int rollNo;
    double cgpa;
    private static int numStudents;
    public Student()
    {
        name="abc";
        numStudents++;
        rollNo=numStudents;
    }
    public static int getNumStudents()
    {
        return numStudents;
    }

}
