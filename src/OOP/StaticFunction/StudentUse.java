package OOP.StaticFunction;

public class StudentUse
{
    public static void main(String args[])
    {
        System.out.println(Student.getNumStudents());
        Student s1 = new Student();
        Student s2 =new Student();
        System.out.println(Student.getNumStudents());
    }
}
