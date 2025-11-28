import java.util.ArrayList;

class Arr_ArrList {
    private String name;
    private ArrayList<Integer> marks;

    public Arr_ArrList() {
        this.name = "Unknown";
        this.marks = new ArrayList<>();
    }

    public Arr_ArrList(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public Arr_ArrList(String name, ArrayList<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public boolean removeMark(int index) {
        if (index >= 0 && index < marks.size()) {
            marks.remove(index);
            return true;
        }
        return false;
    }

    public double calculateAverage() {
        if (marks.isEmpty()) return 0.0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }
}

public class Student {
    public static void main(String[] args) {
        Arr_ArrList s1 = new Arr_ArrList("Nitish");
        s1.addMark(85);
        s1.addMark(90);
        s1.addMark(78);

        System.out.println("Student: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
        System.out.println("Average: " + s1.calculateAverage());

        boolean removed = s1.removeMark(1);
        System.out.println("Removed index 1: " + removed);
        System.out.println("Marks after removal: " + s1.getMarks());
        System.out.println("New Average: " + s1.calculateAverage());

        ArrayList<Integer> initialMarks = new ArrayList<>();
        initialMarks.add(100);
        initialMarks.add(95);
        initialMarks.add(95);

        Arr_ArrList s2 = new Arr_ArrList("Raj", initialMarks);
        System.out.println("\nStudent: " + s2.getName());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Average: " + s2.calculateAverage());
    }
}
