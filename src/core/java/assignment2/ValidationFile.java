package core.java.assignment2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationFile<T> {
    Boolean flag = false;
    String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    public boolean validateDataType(T o , String type)
    {


        if(type =="Numeric")
        {
           return  Integer.class.isInstance(o);
        }
        if (type =="String")
        {
          return String.class.isInstance(o);
        }
        if(type== "Boolean")
        {
            return Boolean.class.isInstance(o);
        }
        if(type=="Double")
        {
         //  System.out.println(o.getClass().getTypeName());
           return Double.class.isInstance(o);
        }
            return false;
    }

    public boolean validateLength(String data , int maxlength)
    {
        if(data.length()<= maxlength)
            return true;
        else
        return false ;
    }
    public boolean checkSpecialCharacter(String data , String specialChar )
    {
        for (int i=0; i < data.length() ; i++)
        {
            char ch = data.charAt(i);
            if(specialChar.contains(Character.toString(ch))) {
               // System.out.println(data+ " contains special character");
                flag= false;
                break;

            }
            else if(i == data.length()-1) {
               // System.out.println(data + " does NOT contain special character");
                flag = true;
            }

        }
        return flag;
    }

    public boolean domainValueVarify(T data , List<T> list )
    { flag = false;
     flag =  list.contains(data);
        return flag;
    }


    public boolean varifyEmail(String email)
    {flag = false;

        if(email.matches(emailRegex))
            flag= true;
        else
            flag = false;
       return flag;
    }

    public  boolean isValidDateFormat(String format, String value) {
        LocalDateTime ldt = null;
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern(format);

        try {
            ldt = LocalDateTime.parse(value, fomatter);
            String result = ldt.format(fomatter);
            return result.equals(value);
        } catch (DateTimeParseException e) {
            try {
                LocalDate ld = LocalDate.parse(value, fomatter);
                String result = ld.format(fomatter);
                return result.equals(value);
            } catch (DateTimeParseException exp) {
                try {
                    LocalTime lt = LocalTime.parse(value, fomatter);
                    String result = lt.format(fomatter);
                    return result.equals(value);
                } catch (DateTimeParseException e2) {
                    // Debugging purposes
                    //e2.printStackTrace();
                }
            }
        }

        return false;
    }

}
