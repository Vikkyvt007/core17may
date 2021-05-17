package core.java.model;

public class LoanProduct {
   private String loanProductCode;
   private String loanProductName;
   private boolean assetBased;
   private String loanSecurityType;
   private double minTenure;
   private double maxTenure;
   private double minLoanAmount;
   private double maxloanAnount;
   private double roi;
   private int ltv ;

    public String getLoanProductCode() {
        return loanProductCode;
    }

    public void setLoanProductCode(String loanProductCode) {
        this.loanProductCode = loanProductCode;
    }

    public String getLoanProductName() {
        return loanProductName;
    }

    public void setLoanProductName(String loanProductName) {
        this.loanProductName = loanProductName;
    }

    public boolean isAssetBased() {
        return assetBased;
    }

    public void setAssetBased(boolean assetBased) {
        this.assetBased = assetBased;
    }

    public String getLoanSecurityType() {
        return loanSecurityType;
    }

    public void setLoanSecurityType(String loanSecurityType) {
        this.loanSecurityType = loanSecurityType;
    }

    public double getMinTenure() {
        return minTenure;
    }

    public void setMinTenure(double minTenure) {
        this.minTenure = minTenure;
    }

    public double getMaxTenure() {
        return maxTenure;
    }

    public void setMaxTenure(double maxTenure) {
        this.maxTenure = maxTenure;
    }

    public double getMinLoanAmount() {
        return minLoanAmount;
    }

    public void setMinLoanAmount(double minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    public double getMaxloanAnount() {
        return maxloanAnount;
    }

    public void setMaxloanAnount(double maxloanAnount) {
        this.maxloanAnount = maxloanAnount;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public int getLtv() {
        return ltv;
    }

    public void setLtv(int ltv) {
        this.ltv = ltv;
    }

    public int ltvCalculatorAsPerCollateralType()
    {
   return 0;
    }
}
