package core.java.assignment4;

import java.util.Scanner;

public class MultipleCatchFile {
      int num =0;
     int result=0 ;
      boolean conclusion1 = false;


    public  boolean useMultipleCatch()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("here we will demonstrate multiple catch block");
        System.out.println("enter the number to divide 1000");
        num = sc.nextInt();
        try
        {
            result = 1000/num;
            System.out.println(result);
            conclusion1 = true;
        }

        catch(ArithmeticException ae)
        {
            System.out.println("first catch");
            System.out.println(ae.getMessage());
            conclusion1 = true;
        }
        catch(Exception e )
        {
            System.out.println(e.getMessage());
            conclusion1 = true;
        }

        return conclusion1;

    }


}
