package core.java.model;

import java.util.Date;

public class Customer {
    private  static int count=0;
  private  int customerId;
   private String customerName;
  private   Date dateOfBirth;
  private   String contactNumber;
   private String emailAddress;
  private   double monthlyIncome;
   private String profession;
   private double totalMonthlyExpense;
  private   double  maxEligibleLoanAmount;
   private String designation;
  private   String companyName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId() {
        this.customerId = ++count;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getTotalMonthlyExpense() {
        return totalMonthlyExpense;
    }

    public void setTotalMonthlyExpense(double totalMonthlyExpense) {
        this.totalMonthlyExpense = totalMonthlyExpense;
    }

    public double getMaxEligibleLoanAmount() {
        return maxEligibleLoanAmount;
    }

    public void setMaxEligibleLoanAmount(double maxEligibleLoanAmount) {
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
         public double calculateDBR()
         {
             DbrCalculator dbrCalculator = new DbrCalculator();
         dbrCalculator.calculateDbr(getTotalMonthlyExpense(),getMonthlyIncome());
         return dbrCalculator.getDbr();



         }
         public double calculateMaxEligibleEMI()
         {
           return  0.5*getMonthlyIncome() - 0.2*calculateDBR();

         }
         public double calculateEligibleLoanAmount(double effectiveMonthlyRate , int tenureInYears)
         {

             MaxEligibleLoanCalculator m = new MaxEligibleLoanCalculator();
             m.calculateMaxEligibleLoan(calculateMaxEligibleEMI() , effectiveMonthlyRate , tenureInYears);
            return m.getMax_eligible_loan_amount();
                 // eligible loan amount program
         }
}
