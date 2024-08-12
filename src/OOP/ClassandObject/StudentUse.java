package OOP.ClassandObject;

public class StudentUse
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = new Student();

        s1.name ="Manisha";
        s1.rollNumber=10;
        System.out.println(s1.name + " "+s1.rollNumber);

        s2.name="Ankush";
        s2.rollNumber=50;
        System.out.println(s2.name +" "+s2.rollNumber);
    }
}
