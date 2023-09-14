public class ConstructorOverloading {
    int id;
    String name;

    // default constructor
    public ConstructorOverloading() {
        this.id = 0;
        this.name = "Not Available";
    }

    // overloaded constructor with parameter (int id)
    public ConstructorOverloading(int id) {
        this.id = id;
        this.name = "Not Available";
    }

    // overloaded constructor with parameter (int id and String name)
    public ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Info:- ");
        System.out.println("Employee ID- " + this.id);
        System.out.println("Employee Name- " + this.name);
    }

    public static void main(String[] args) {
        // calling default constructor
        ConstructorOverloading obj = new ConstructorOverloading();
        obj.display();
        // calling one parameterized constructor
        ConstructorOverloading obj2 = new ConstructorOverloading(15);
        obj2.display();
        // calling fully parameterized constructor
        ConstructorOverloading obj3 = new ConstructorOverloading(25,"Rakesh Sharma");
        obj3.display();
    }
}
