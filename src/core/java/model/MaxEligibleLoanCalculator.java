package core.java.model;

public class MaxEligibleLoanCalculator {
  double   max_eligible_loan_amount ;
    double maxEligibleEmi;
     double effectiveMonthlyRate;
     double tenureInYears;

    public MaxEligibleLoanCalculator( double maxEligibleLoanAmount, double maxEligibleEmi,double  effectiveMonthlyRate,double  tenureInYears) {
        this.max_eligible_loan_amount = maxEligibleLoanAmount;
        this.maxEligibleEmi = maxEligibleEmi;
        this.effectiveMonthlyRate = effectiveMonthlyRate;
        this.tenureInYears = tenureInYears;
    }

    public MaxEligibleLoanCalculator() {
    }

    public double getMax_eligible_loan_amount() {
        return max_eligible_loan_amount;
    }

    public void setMax_eligible_loan_amount( double max_eligible_loan_amount) {
        this.max_eligible_loan_amount = max_eligible_loan_amount;
    }

    public double getMaxEligibleEmi() {
        return maxEligibleEmi;
    }

    public void setMaxEligibleEmi(double maxEligibleEmi) {
        this.maxEligibleEmi = maxEligibleEmi;
    }

    public double getEffectiveMonthlyRate() {
        return effectiveMonthlyRate;
    }

    public void setEffectiveMonthlyRate(double effectiveMonthlyRate) {
        this.effectiveMonthlyRate = effectiveMonthlyRate;
    }

    public double getTenureInYears() {
        return tenureInYears;
    }

    public void setTenureInYears(double tenureInYears) {
        this.tenureInYears = tenureInYears;
    }

    public void calculateMaxEligibleLoan(double max_eligible_emi , double effective_monthly_rate ,double  tenure_in_years)
    { setMaxEligibleEmi(max_eligible_emi);
    setEffectiveMonthlyRate(effective_monthly_rate);
    setTenureInYears(tenure_in_years);

  double    numerator =  (getMaxEligibleEmi() * (    Math.pow(1 + getEffectiveMonthlyRate(), getTenureInYears() - 1)));
        double denominator =  (getEffectiveMonthlyRate() * Math.pow(1 + getEffectiveMonthlyRate() , getTenureInYears()));

        setMax_eligible_loan_amount( numerator / denominator);

    }
}
