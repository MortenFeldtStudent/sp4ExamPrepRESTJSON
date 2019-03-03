package entity;

public class Person {

    private String fName;
    private String lName;
    private int id;
    private int age;

    public Person(String fName, String lName, int id, int age) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
