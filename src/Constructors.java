import java.util.zip.CheckedOutputStream;

public class Constructors {
    String name = "Niteesh";
    int age;

    Constructors(){
//        name = "Unknown";
//        age = 0;
    }
    Constructors(String name){
        this.name = name;

    }
    Constructors(String name, int age){
        this.name = name;
        this.age = age;
    }
    Constructors(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        Constructors obj1 = new Constructors("Raj",22);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
