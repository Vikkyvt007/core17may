/*   Shyam has applied for a Home Loan with ABC Bank. The bank has to calculate LTV. LTV is Loan
to Value ratio which describes the size of a loan compared to the value of the property
securing the loan. The bank policy is that LTV can be maximum 80%.
The formula to calculate LTV is
 LTV = Loan amount asked / property value
Write a Java program to calculate the LTV

 */

package core.java.assignment1;

import core.java.model.LTVCalculator;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Question2 {




    public static void main (String args[])
    {
        float loan = 0;
        float property_value = 0;
        float ltv=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter loan amount in number only");
        loan = sc.nextFloat();

        System.out.println("enter property value amount in number only");
        property_value = sc.nextFloat();
        LTVCalculator ltvcal = new LTVCalculator();
        ltvcal.calculateLtv(loan,property_value);
        ltv = ltvcal.getLtv();
        System.out.println("ltv is "+ltv);

       if(ltv >= 0.8)
       {
           System.out.println("application rejected as ltv is "+ ltv*100  + " percentage , greater than 80 %");
       }
          else
       {
           System.out.println("application accepted as ltv is "+ltv*100 +" percentage");
       }
    }


}
