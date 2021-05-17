package core.java.assignment4;

import java.util.Scanner;

public class Question4 {
    int num ;
    public static void main(String args[])
    {
                 Question4 q4 = new Question4();
                 q4.foo();
    }
    public  void foo()
    {

           try{
               bar();
           }
          catch(Exception e)
          {
            System.out.println(e);
          }



    }
    public  void bar() throws Exception
    {
        System.out.println("enter the number to divide 1000");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num == 0)
        {
            throw new ArithmeticException("dividing by 0 is not a good idea");
        }
    }
}
