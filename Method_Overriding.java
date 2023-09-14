//method overriding
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows!");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        // to get the sound of animal
        Animal a = new Animal();
        a.makeSound();
        // to get the sound of dog
        Dog obj = new Dog();
        obj.makeSound();
        // to get the sound of cat
        Cat obj2 = new Cat();
        obj2.makeSound();
    }
}
