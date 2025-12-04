// Demonstrates: Constructors, Types, Encapsulation
class Student {
    private final int studentId;
    private String name;
    private int age;
    private static int counter = 1;

    public Student() {
        this("Unknown", 0);
    }

    public Student(String name, int age) {
        this.studentId = counter++;
        this.name = name;
        this.age = age;
    }

    public Student(Student other) {
        this(other.name, other.age);
    }

    public int getId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public void display() {
        System.out.println("[Student id=" + getId() + ", name=" + name + ", age=" + age + "]");
    }
}

class Undergraduate extends Student {
    private String department;
    private int year;

    public Undergraduate() {
        super();
        this.department = "General";
        this.year = 1;
    }

    public Undergraduate(String name, int age, String department, int year) {
        super(name, age);
        this.department = department;
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Undergraduate [id=" + getId() + ", name=" + getName()
                + ", age=" + getAge() + ", dept=" + department + ", year=" + year + "]");
    }

    public void promoteYear() {
        this.year = this.year + 1;
    }
}

public class StudentRegistration {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Niteesh", 21);
        Student s3 = new Student(s2);

        Undergraduate u1 = new Undergraduate();
        Undergraduate u2 = new Undergraduate("Swaroop", 20, "CSE", 2);

        s1.setName("Raj");
        s1.setAge(21);

        Student poly = u2;

        System.out.println("Displaying the student Registration Details:");
        s1.display();
        s2.display();
        s3.display();
        u1.display();
        u2.display();

        System.out.println("Demo Of Polymorphism:");
        poly.display();

        if (poly instanceof Undergraduate) {
            Undergraduate down = (Undergraduate) poly;
            down.promoteYear();
            System.out.println("After Promote Year:");
            down.display();
        }
    }
}
