/**
 * Constructor:
 * constructors are special member methods whose name is same as class name.
*  constructor do not have any return type not even void.
*  constructor gets called automaticallty when object is created.
*  constructor is mainly used to initialise the object.
 */
public class Constructor {
    private String name;
    private int age;
    private double height;
    //for private variables, getters and setters is compulsory
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Constructor()
    {
        //default constructor
    }
    public static void main(String[] args) {
            Constructor c= new Constructor();
            c.setName("Radha Kumari");
            c.setAge(40);
            c.setHeight(157);
            System.out.println("Name entered is: "+c.getName());
            System.out.println("Age entered is: "+c.getAge());
            System.out.println("Height entered is: "+c.getHeight());
    }
}
