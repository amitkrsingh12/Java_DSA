package AnitaSethBook.Methods;

public class FinalAttribute
{
    final int marks=80;
    void run()
    {
        // cannot reassign final
      //  marks =60;
        System.out.println("Subject Cleared");
    }
    public static void main(String args[])
    {
        FinalAttribute obj = new FinalAttribute();
        obj.run();
    }
}
