/*
 * WAP to create class Car with minimum three objects 
 * describing feature as brand,color,price.
 */
public class CarConst {
    double price;
    String color;
    public CarConst(){
        this.price=100000;
        this.color="Blue";
    }
    public CarConst(double price){
        this.price=price;
        this.color="null";
    }
    public CarConst(float price, String color){
        this.price=price;
        this.color=color;
    }
    public void display(){
        System.out.println("Car Specifications:- ");
        System.out.println("Car price- "+this.price);
        System.out.println("Color Available- "+this.color);
    }
    public static void main(String[] args) {
        System.out.println("Details of Honda: ");
        CarConst Honda= new CarConst(); // calling default constructor
        Honda.display();

        System.out.println("Details of Suzuki: ");
        CarConst Suzuki=new CarConst(12335.56); // calling one parameterized constructor
        Suzuki.display();

        System.out.println("Details of TATA: ");
        CarConst TATA=new CarConst(408500, "Black"); // calling fully parameterized constructor
        TATA.display();
    }
}
