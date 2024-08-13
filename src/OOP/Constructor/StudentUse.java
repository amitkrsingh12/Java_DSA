package OOP.Constructor;

public class StudentUse {
    public static void main(String args[])
    {
        Student s1 = new Student("Amit",10);

        s1.print();
        Student s2 = new Student();
        s2.print();
    }
}
