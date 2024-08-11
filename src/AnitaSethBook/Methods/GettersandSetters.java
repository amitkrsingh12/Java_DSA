package AnitaSethBook.Methods;

public class GettersandSetters
{
    private String EmployeeName;
    String getName()
    {
        return EmployeeName;
    }
    public void setName(String str)
    {
        EmployeeName=str;
    }
    public static void main(String args[])
    {
        GettersandSetters obj = new GettersandSetters();
        obj.setName("Amit");
        System.out.println(obj.getName());
    }
}
