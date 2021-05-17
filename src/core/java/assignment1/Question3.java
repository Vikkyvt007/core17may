/*Before a Loan can be processed by a Bank, the Bank has to find out the Maximum Loan
Amount which can be given to a particular applicant. The formula to calculate the Maximum
Eligible Loan Amount is as below:
Max_eligible_Loan_amount = E * ( ( 1 + R) ^t) -1 )/ (R * (( 1 + R) ^t  )
Where
E = Max eligible EMI (50% of effective monthly salary after deducting 20% DBR)
R = effective Monthly Rate
T = tenure (Max tenure which can be considered is 7 years)
Create a java program to calculate Max Eligible Loan Amount for an applicant. */

package core.java.assignment1;

import core.java.model.MaxEligibleLoanCalculator;

import java.util.Scanner;

public class Question3 {

    public static void main(String args[])
    {
        float max_eligible_loan_amount ;
        float max_eligible_emi;
        float effective_monthly_rate;
        float tenure_in_years ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter max eligible emi");
        max_eligible_emi= sc.nextFloat();

        System.out.println(" enter effective monthly rate");
        effective_monthly_rate= sc.nextFloat();

        System.out.println("enter tenure in years");
        tenure_in_years= sc.nextFloat();

        MaxEligibleLoanCalculator mel_cal = new MaxEligibleLoanCalculator();

        mel_cal.calculateMaxEligibleLoan(max_eligible_emi,effective_monthly_rate , tenure_in_years);

        max_eligible_loan_amount = (float) mel_cal.getMax_eligible_loan_amount();


        /*
        float numerator = (float) (max_eligible_emi * (    Math.pow(1 + effective_monthly_rate,tenure_in_years) - 1));
        float denominator = (float) (effective_monthly_rate * Math.pow(1 + effective_monthly_rate , tenure_in_years));

        max_eligible_loan_amount = numerator / denominator ;
*/
        System.out.println(" max eligible loan amount is " + max_eligible_loan_amount);

    }
}
