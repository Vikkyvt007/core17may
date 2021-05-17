package core.java.practice;

public class TestEmployee {
    public static void main(String args[])
    {
        Employee[] e= new Employee[3];
        e[0] = new Employee();
        e[1]= new Employee();
        e[2] = new Employee();
           e[0].setData(1, "aman");
           e[1].setData(2,"abhay");

           e[0].showData();
           e[1].showData();
    }
}
