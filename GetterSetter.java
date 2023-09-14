/**
 * Assignment 3: getter and setter methods gets called when passing values. 
 * For static assignment , getter setter methods are not required.
 */
public class GetterSetter {
    private int age;
    private String name;
    private String department;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public GetterSetter(int age, String name, String department) {
        // default constructor
        this.age=age;
        this.name=name;
        this.department=department;
    }

    public static void main(String[] args) {
        GetterSetter sd = new GetterSetter(21,"Asif Akhtar","Computer Science");

        System.out.println("Your Name : " + sd.getName());
        System.out.println("Your Age : " + sd.getAge());
        System.out.println("Your Department : " + sd.getDepartment());
    }
}
