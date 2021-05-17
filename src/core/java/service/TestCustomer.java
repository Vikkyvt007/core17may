package core.java.service;

import core.java.model.Customer;

import java.sql.Date;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer= new Customer();

        customer.setCustomerName("aman");
        customer.setContactNumber("8348484");
        customer.setEmailAddress("tdkj@gmail.com");
        customer.setDateOfBirth(Date.valueOf("1997-07-10"));
        customer.setDesignation("engineer");
        customer.setCompanyName("nucleus");
        customer.setProfession("engineer");
        customer.setTotalMonthlyExpense(20000);
        customer.setMonthlyIncome(50000);

        System.out.println( customer.calculateEligibleLoanAmount(0.5,5));
        System.out.println(   customer.calculateDBR());
        System.out.println(customer.calculateMaxEligibleEMI());


    }
}
