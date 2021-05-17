package core.java.model;

public class LTVCalculator {
    float loan = 0;
    float property_value = 0;
    float ltv=0;

    public float getLoan() {
        return loan;
    }

    public void setLoan(float loan) {
        this.loan = loan;
    }

    public float getProperty_value() {
        return property_value;
    }

    public void setProperty_value(float property_value) {
        this.property_value = property_value;
    }

    public float getLtv() {
        return ltv;
    }

    public void setLtv(float ltv) {
        this.ltv = ltv;
    }
    public void calculateLtv(float loan , float property_value)
    {
        setLoan(loan);
        setProperty_value(property_value);
        ltv=(getLoan()/getProperty_value());
        this.ltv=ltv;
    }
}
