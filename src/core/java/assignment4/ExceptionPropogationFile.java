package core.java.assignment4;

public class ExceptionPropogationFile {
    int arr[]={5,4,3};
   public void dostart()
    {
        try {
            System.out.println("started (1)");
            examineIntermediate();
        }
        catch (Exception e)
        {
            System.out.println(" this is catch block of start method . Exception is caught here (4).");
        }
    }
   public void examineIntermediate()
    {
        System.out.println("this is intermediate block  before calling complete method (2)");
        completeProcess();
        System.out.println("intermediate after calling complete process");
    }
    public void completeProcess()
    {     System.out.println("before exception complete method  (3)");
        System.out.println(arr[3]);     //execption -- this will seek for catch block to handle exception and terminate
        System.out.println("after exception complete process");
    }
}
