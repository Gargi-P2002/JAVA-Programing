/**
 * A
 */
class A {
void m(){
    System.out.println("Hello m");
}
void n(){
    System.out.println("Hello n"); 
    this.m();    //calling another member methos from another method in the same class.
}
}
    
public class TestThis2 {
    public static void main(String[] args) {
        A a = new A ();
        a.n();
    }
}
