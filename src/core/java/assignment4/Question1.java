package core.java.assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1
{     int num =0;
        int result=0 ;


    public static void main(String args[])
    {
        /*
        System.out.println("*************** part 1 **************************");
           MultipleCatchFile mcf = new MultipleCatchFile();
          System.out.println(" multiple catch block allowed  :-----: "+mcf.useMultipleCatch() );
          System.out.println("************************\n**********************\n\n");


           System.out.println("*************** part 2 **************************");
          TryCatchFinallyFile tcf = new TryCatchFinallyFile();
          System.out.println("in try catch finally combination , finally will always execute ?? --"+tcf.useTryCatchFinally());


        System.out.println("*************** part 3**************************");
        TryFinallyFile tf = new TryFinallyFile();
        System.out.println("try finally executes successfully but in case of exception it \n is not able to handle exception without catch+"+tf.useTryFinally());

        System.out.println("*************** part 4**************************");
        ExceptionPropogationFile epf = new ExceptionPropogationFile();
         epf.dostart();

*/
        NestedTryBlockFile nstf = new NestedTryBlockFile();
        nstf.onlyTryTest();

    }


}

/* conclusion more than one catch blocks are allowed for single try block but order should be sppecific to general
* other wise  error ---- "exception java.lang.ArithmeticException has already been caught"
* */

