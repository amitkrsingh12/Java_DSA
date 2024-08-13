package OOP.Constructor;

public class StudentUse {
    public static void main(String args[])
    {
        System.out.println(Student.numStudents);
        Student s1 = new Student("Amit",10);

    //    s1.print();
        Student s2 = new Student("Pratiuk",20);
    //    s2.print();
        System.out.println(Student.numStudents);
    }
}
