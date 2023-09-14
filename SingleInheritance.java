import java.util.*;
//single inheritance
class Base {
    int a,b,ans;
    Scanner sc=new Scanner(System.in);
    public void inputData(){
        System.out.print("Enter number one: ");
        a=sc.nextInt();
        System.out.print("Enter number two: ");
        b=sc.nextInt();
        sc.close();
    }
}
class Derived extends Base{
 public void add(){
    ans=a+b;
    System.out.println("Addition of two numbers: "+ans);
 }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.inputData();
        obj.add();
    }
    
}
