package core.java.assignment1;

import core.java.model.DbrCalculator;

import java.util.Scanner;

public class Question1{

    public static void main (String args[])
    {
        float expense = 0;
        float monthly_income = 0;
        float dbr=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter expense amount in number only");
        expense= sc.nextFloat();

        System.out.println("enter Monthly Income amount in number only");
        monthly_income = sc.nextFloat();
        DbrCalculator dbrcal = new DbrCalculator();
        dbrcal.calculateDbr(expense,monthly_income);
        System.out.println("dbr is "+dbrcal.getDbr());



    }

}
