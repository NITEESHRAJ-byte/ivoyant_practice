class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog2 extends Animal {
    void sound() {
        System.out.println("Dog sound Bhau");
    }

}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat sounds Meow");
    }
}


public class Polymorphism {
    public static void main(String[] args){
        Dog2 obj = new Dog2();
        obj.sound();

        Cat obj2 = new Cat();
        obj2.sound();
    }
}
