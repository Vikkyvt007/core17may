package core.java.assignment4;

import java.util.Scanner;

public class ThrowDemoFile {
    int age;
    public void sameMethodHandle()
    {
        try
        {
            System.out.println("enter your age ");
            Scanner sc =  new Scanner(System.in);
            age =sc.nextInt();
            if(age < 45  )
            {
                throw new ArithmeticException("you are not eligible for vaccination. wait till next order");
            }
            else
            {
                System.out.println("proceed ..");
            }
        }
        catch(Exception e )
        {      System.out.println("exception "+e);
            System.out.println(" message : "+e.getMessage());
        }
    }

    public void useThrowsAndCall()
    {
            System.out.println("enter your age ");
            Scanner sc =  new Scanner(System.in);
            age =sc.nextInt();
                try {
                    ThrowDemoFile.func(age);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }

    }

    public static void func(int age) throws  ArithmeticException {


        if (age < 45) {
            throw new ArithmeticException("you are not eligible for vaccination. wait till next order");
        } else {
            System.out.println("eligible for vaccination ..");

        }
    }
}
