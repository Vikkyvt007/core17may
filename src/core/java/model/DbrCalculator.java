package core.java.model;

public class DbrCalculator {
  private   double expense = 0;
   private double monthlyIncome = 0;
   private double dbr=0;

    public DbrCalculator() {
        //default constructor
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getDbr() {
        return dbr;
    }

    public void setDbr(float dbr) {
        this.dbr = dbr;
    }

    public void calculateDbr(double expense , double monthlyIncome)
    {     setExpense(expense);
          setMonthlyIncome(monthlyIncome);
        this.dbr=(getExpense()/ getMonthlyIncome());


    }
}
