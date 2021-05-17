package core.java.assignment5;

public class TestMyClassSubSecond {
    public static void main(String[] args) {
        MyClassSubSecond ms = new MyClassSubSecond();
        ms.fun3();
       // ms.fun4();
        // fun4() has protected access in core.java.assignment5.pack1.MyClass

       // ms.fun2();
        /*
        java: cannot find symbol
  symbol:   method fun2()
  location: variable ms of type core.java.assignment5.MyClassSubSecond
         */

       // ms.fun1();
        /*
        java: cannot find symbol
  symbol:   method fun1()
  location: variable ms of type core.java.assignment5.MyClassSubSecon
         */

    }
}
