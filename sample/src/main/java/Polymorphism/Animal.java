package Polymorphism;

public class Animal {
    void Eat() {
        System.out.println("Dog is Animal");
    }

class Dog extends Animal {
    @Override
    void Eat() {
        System.out.println("Dog Barks");
    }
}

    public static void main(String[] args){
        Animal a = new Animal();
        a.Eat();
    }
}
