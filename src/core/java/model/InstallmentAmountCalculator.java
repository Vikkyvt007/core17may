package core.java.model;

public class InstallmentAmountCalculator {

    float installment_amount;
    float original_principal_loan_amount;
    float interest_rate_per_annum;
    int total_number_of_payment_in_a_year;
    int number_of_installments;
    float rv_at_end_of_tenure;

    public InstallmentAmountCalculator() {
    }

    public float getInstallment_amount() {
        return installment_amount;
    }
/*
    public void setInstallment_amount(float installment_amount) {
        this.installment_amount = installment_amount;
    }

 */

    public float getOriginal_principal_loan_amount() {
        return original_principal_loan_amount;
    }

    public void setOriginal_principal_loan_amount(float original_principal_loan_amount) {
        this.original_principal_loan_amount = original_principal_loan_amount;
    }

    public float getInterest_rate_per_annum() {
        return interest_rate_per_annum;
    }

    public void setInterest_rate_per_annum(float interest_rate_per_annum) {
        this.interest_rate_per_annum = interest_rate_per_annum;
    }

    public int getTotal_number_of_payment_in_a_year() {
        return total_number_of_payment_in_a_year;
    }

    public void setTotal_number_of_payment_in_a_year(int total_number_of_payment_in_a_year) {
        this.total_number_of_payment_in_a_year = total_number_of_payment_in_a_year;
    }

    public int getNumber_of_installments() {
        return number_of_installments;
    }

    public void setNumber_of_installments(int number_of_installments) {
        this.number_of_installments = number_of_installments;
    }

    public float getRv_at_end_of_tenure() {
        return rv_at_end_of_tenure;
    }

    public void setRv_at_end_of_tenure(float rv_at_end_of_tenure) {
        this.rv_at_end_of_tenure = rv_at_end_of_tenure;
    }

    public void calculateInstallmentAmount(float original_principal_loan_amount , float interest_rate_per_annum , int total_number_of_payment_in_a_year , int number_of_installments , float rv_at_end_of_tenure)
    {
        setOriginal_principal_loan_amount(original_principal_loan_amount);
        setInterest_rate_per_annum(interest_rate_per_annum);
        setTotal_number_of_payment_in_a_year(total_number_of_payment_in_a_year);
        setNumber_of_installments(number_of_installments);
        setRv_at_end_of_tenure(rv_at_end_of_tenure);

        float comp1 = getOriginal_principal_loan_amount() * getInterest_rate_per_annum() /getTotal_number_of_payment_in_a_year() ;
        float comp2 = (float) ((getRv_at_end_of_tenure() * getInterest_rate_per_annum()/ getTotal_number_of_payment_in_a_year())/Math.pow(1+(getInterest_rate_per_annum()/getTotal_number_of_payment_in_a_year()) , getNumber_of_installments()));
        float comp3 = (float) (1- (1/Math.pow(1+(getInterest_rate_per_annum()/getTotal_number_of_payment_in_a_year()),getNumber_of_installments())));
        installment_amount =( comp1 - comp2)/ comp3 ;
          this.installment_amount = installment_amount;
    }
}
