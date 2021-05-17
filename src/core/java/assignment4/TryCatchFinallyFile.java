package core.java.assignment4;

import java.util.Scanner;

public class TryCatchFinallyFile {
     int result =0;
     int m =0;
     int n =0;
     boolean conclusion = false;
    public boolean  useTryCatchFinally( )
    {     System.out.println(" enter two numbersm &n to divide m/n");
        Scanner sc = new Scanner(System.in);
        m= sc.nextInt();
        n=sc.nextInt();
        try
        {    result= m/n;
            System.out.println("try block");
        }
        catch(Exception e)
        {
            System.out.println("catch block ");

        }
        finally {
            System.out.println("finally will always execute");
            conclusion = true;
        }
        return conclusion;
    }
}
