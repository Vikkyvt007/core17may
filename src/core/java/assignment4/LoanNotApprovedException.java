package core.java.assignment4;

public class LoanNotApprovedException  extends Exception{
    String message;
    public LoanNotApprovedException(String s )

    {
        super(s);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString()
    {
        return "LoanNotApprovedExceptionOccured";
    }
}
