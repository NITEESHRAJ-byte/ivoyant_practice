class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}
    class Dog extends Animal2 {
        void bark() {
            System.out.println("Dog is Barking");
        }

    }


public class Inheritance {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
