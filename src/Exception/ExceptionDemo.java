package Exception;

public class ExceptionDemo
{
    public static int fact(int n) throws NegativeNumberException {
        if(n<0)
        {
            throw new NegativeNumberException();
        }
        int ans=1;
        for(int i=2;i<=n;i++)
        {
            ans *=i;
        }
        return ans;
    }
    public static int divide(int a,int b) throws DivideByZeroException {
        if (b==0)
        {
            throw new DivideByZeroException();
        }
        return a/b;
    }
    public static void main(String args[])
{
    try {
        divide(10,5);
        System.out.println(fact(-1));
    } catch (DivideByZeroException e) {
        System.out.println("Divide by zero exception");
    } catch (NegativeNumberException e) {
        System.out.println("Negative no exception");
    }finally {
        System.out.println("Process Completed.");
    }
    System.out.println("Main Block");
}
}
