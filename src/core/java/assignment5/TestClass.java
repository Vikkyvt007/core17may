package core.java.assignment5;

import core.java.assignment5.pack1.MyClass;

public class TestClass {
    public static void main(String args[])
    {
        MyClass m = new MyClass();
        m.fun3();

        // m.fun1();
        //java: fun1() has private access in core.java.assignment5.pack1.MyClass

     //   m.fun2();
        // java: fun2() is not public in core.java.assignment5.pack1.MyClass; cannot be accessed from outside package

       // m.fun4();
        //java: fun4() has protected access in core.java.assignment5.pack1.MyClass
    }
}
