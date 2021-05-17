package core.java.assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestValidation {
    public static void main(String[] args) {
        String a= "ex%";
        String data = " abdfgdhhish*^?";
        String pattern="";
      ValidationFile v = new ValidationFile();

      /*
      System.out.println(v.validateDataType(a , "String"));
        System.out.println(v.validateDataType("amit" , "String"));
        System.out.println(v.validateDataType(false , "Boolean"));
        System.out.println(v.validateDataType(0.11 , "Double"));
        System.out.println(v.validateDataType(0.11 , "Numeric"));
      */

        /*
        System.out.println("enter characters to avoid");
        Scanner sc = new Scanner(System.in);
        pattern = sc.next();
        System.out.println( v.checkSpecialCharacter(data, pattern));
         */

        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednessday");

        System.out.println(v.domainValueVarify("Monday", list));

        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);

        System.out.println(v.domainValueVarify(3 , list1));
       */

        /*
        System.out.println(v.varifyEmail("shhusghshdks@.@.com"));
        System.out.println(v.varifyEmail("abhdgdhiuhfjf@gmail.com"));
           */

        System.out.println(v.isValidDateFormat("dd/MM/yyyy" ,"25/09/2013" ));
        System.out.println(v.isValidDateFormat("MM/dd/yyyy", "17/05/2020"));
    }
}
