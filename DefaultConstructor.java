/*
 * Constructor is a special member method that is creaated with the same name as a class name
 * They get called automatically when an object is initialised.
 * They donot have any return type, not even void.
 */

public class DefaultConstructor {
    public DefaultConstructor() {
        System.out.println("Default constructor is getting called");
    }

    public void display() {
        System.out.println("Here is a simple method");
    }

    public static void main(String[] args) {
        // default constructor gets called
        DefaultConstructor obj = new DefaultConstructor();
        // method gets called
        obj.display();
    }
}
