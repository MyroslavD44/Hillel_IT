package dz6;

public class Employee {

    private String lastName;
    private String name;
    private String position;
    private int hourlySalary;

    public Employee(String lastName, String name, String position, int hourlySalary) {
        this.lastName = lastName;
        this.name = name;
        this.position = position;
        this.hourlySalary = hourlySalary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}


