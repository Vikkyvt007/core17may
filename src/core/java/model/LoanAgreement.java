package core.java.model;

import java.util.Date;

public class LoanAgreement {
    private  static  int count=0;

   private int loanAgreementId;
    LoanProduct loanProduct;
   private double loanAmount;
   private int tenure;
  private  double roi;
  private   boolean loanStatus;
   private double emiPerMonth;
     Date loanDisbursalDate;
    private int repaymentFrequency;

    public int getLoanAgreementId() {
        return loanAgreementId;
    }

    public void setLoanAgreementId() {
        this.loanAgreementId = (++count);
    }

    public LoanProduct getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(LoanProduct loanProduct) {
        this.loanProduct = loanProduct;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public boolean isLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(boolean loanStatus) {
        this.loanStatus = loanStatus;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public Date getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public void setLoanDisbursalDate(Date loanDisbursalDate) {
        this.loanDisbursalDate = loanDisbursalDate;
    }

    public int getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(int repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    public void  calculateEMI()
    {

    }
    public void generateRepaymentSchedule()
    {

    }
    public double calculateLoanPenalty(Date currentDate)
    {
   return 0;
    }
    public double calculateLoanToValueRatio()
    {
              return 0 ;
    }

}
