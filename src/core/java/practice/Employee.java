package core.java.practice;

public class Employee {
    int id;
    String name;

    public void setData(int id , String name)
    {
        this.id=id;
        this.name=name;
    }

    public void showData()
    {
        System.out.println(" employee id is   "+id +"   name is   "+name);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
