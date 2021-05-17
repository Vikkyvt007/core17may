package core.java.assignment5.pack1.subpack1;

public class TestMyClassSubThird {
    public static void main(String[] args) {
        MyClassSubThird m = new MyClassSubThird();
        m.fun3();
       // m.fun4();
        //java: fun4() has protected access in core.java.assignment5.pack1.MyClass

     //   m.fun2();
        /*
        java: cannot find symbol
  symbol:   method fun2()
  location: variable m of type core.java.assignment5.pack1.subpack1.MyClassSubThird
         */

      //  m.fun1();
        /*
        java: cannot find symbol
  symbol:   method fun1()
  location: variable m of type core.java.assignment5.pack1.subpack1.MyClassSubThird
         */
    }
}
