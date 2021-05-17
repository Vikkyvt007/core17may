package core.java.resources;

import core.java.assignment4.LoanNotApprovedException;

public class EligibilityValidator  {
           String message=null;
    int loan_amount ;
    int max_eligible_amount ;
    int dbr ;
    int emi ;
    int max_eligible_emi ;
    int age ;

    public EligibilityValidator(String message, int loan_amount, int max_eligible_amount, int dbr, int emi, int max_eligible_emi) {
        this.message = message;
        this.loan_amount = loan_amount;
        this.max_eligible_amount = max_eligible_amount;
        this.dbr = dbr;
        this.emi = emi;
        this.max_eligible_emi = max_eligible_emi;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(int loan_amount) {
        this.loan_amount = loan_amount;
    }

    public int getMax_eligible_amount() {
        return max_eligible_amount;
    }

    public void setMax_eligible_amount(int max_eligible_amount) {
        this.max_eligible_amount = max_eligible_amount;
    }

    public int getDbr() {
        return dbr;
    }

    public void setDbr(int dbr) {
        this.dbr = dbr;
    }

    public int getEmi() {
        return emi;
    }

    public void setEmi(int emi) {
        this.emi = emi;
    }

    public int getMax_eligible_emi() {
        return max_eligible_emi;
    }

    public void setMax_eligible_emi(int max_eligible_emi) {
        this.max_eligible_emi = max_eligible_emi;
    }

    public void generalLoanConditionValidate() throws LoanNotApprovedException
      {
           if (this.loan_amount > this.max_eligible_amount )
           {   throw new LoanNotApprovedException("loan amount is greater than max eligible amount ");

           }
          if(this.dbr > 40)
          {
              throw new LoanNotApprovedException("dbr is less than 40 %");
          }
         if ( this.emi > this.max_eligible_emi)
         {
             throw new LoanNotApprovedException(" emi is greater than max eligible emi");
         }

      }
      public void homeLoanConditionValidate()
      {

      }

}
