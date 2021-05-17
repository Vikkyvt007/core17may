package core.java.assignment4;

import java.util.Scanner;

public class TryFinallyFile {
    int m=0;
    int n=0;
    int result =0;
    boolean conclusion = false;
    public boolean useTryFinally()
    {
        try{

            System.out.println(" enter two numbersm &n to divide m/n");
            Scanner sc = new Scanner(System.in);
            m= sc.nextInt();
            n=sc.nextInt();
            result =  m/n ;
            System.out.println("try block executed ");

        }
        finally
        {

                   System.out.println("finally block");
                   conclusion = true;
        }
        return conclusion;
    }

}
