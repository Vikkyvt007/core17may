package core.java.assignment1;

import core.java.model.InstallmentAmountCalculator;

import java.util.Scanner;

public class Question4 {

    public static void main( String args[])
    {
     float installment_amount;
     float original_principal_loan_amount;
     float interest_rate_per_annum;
     int total_number_of_payment_in_a_year;
     int number_of_installments;
     float rv_at_end_of_tenure;
          Scanner sc = new Scanner(System.in);
        System.out.println(" enter  original principal amount ");
      original_principal_loan_amount=  sc.nextFloat();

        System.out.println(" enter   interest rate per annum");
       interest_rate_per_annum = sc.nextFloat();

        System.out.println(" enter  total number of payment in a year ");
      total_number_of_payment_in_a_year =  sc.nextInt();

        System.out.println(" enter  number of installments ");
        number_of_installments = sc.nextInt();

        System.out.println(" enter  rv of loan at end of tenure ");
       rv_at_end_of_tenure = sc.nextFloat();

        InstallmentAmountCalculator installmentAmountCalculator = new InstallmentAmountCalculator();
        installmentAmountCalculator.calculateInstallmentAmount(original_principal_loan_amount ,interest_rate_per_annum ,total_number_of_payment_in_a_year ,number_of_installments , rv_at_end_of_tenure);
/*

     float comp1 = original_principal_loan_amount * interest_rate_per_annum /total_number_of_payment_in_a_year ;
     float comp2 = (float) ((rv_at_end_of_tenure * interest_rate_per_annum/ total_number_of_payment_in_a_year)/Math.pow(1+(interest_rate_per_annum/total_number_of_payment_in_a_year) , number_of_installments));
     float comp3 = (float) (1- (1/Math.pow(1+(interest_rate_per_annum/total_number_of_payment_in_a_year),number_of_installments)));
        installment_amount =( comp1 - comp2)/ comp3 ;
*/
       installment_amount =  installmentAmountCalculator.getInstallment_amount();
        System.out.println(" installment amount is ::"+ installment_amount+"rupees");

    }
}
