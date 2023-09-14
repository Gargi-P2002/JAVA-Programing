/**
 * TestThis
 */
class Student {
int rollno;
float fee;
String name;
public Student(int rollno, String name, float fee){
    this.rollno = rollno ;  // this keyword is used to access the object properties in a class
    this.name=name;  //this keyword is used to refer the variables of the current class. also it reduces the confusion when the  class variable names are same as passed variables.
    this.fee=fee;  // ultimately, it is used to reduce the creation of huge number of variables. 
}
void display(){
    System.out.println("Roll no: "+rollno);   //this keyword can be used for accessing instance variables of an object
    System.out.println("Name: "+name);   ///this keyword can be used for accessing instance variables of an object
    System.out.println("Fee payable: "+fee);
}
    
}

public class TestThis {
    public static void main(String[] args) {
        Student s1 = new Student (2078,"Radhika",5600 );   /// creating an instance of student class and assigning
        Student s2 = new Student (2210,"Rahul",8600 );   /// creating an instance of student class and assigning
        s1.display();
        s2.display();
    }
    
}
