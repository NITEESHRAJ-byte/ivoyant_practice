import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList: " + numbers);

        numbers.set(1, 25);
        System.out.println("Modified ArrayList: " + numbers);

        numbers.remove(0);
        System.out.println("ArrayList after removal: " + numbers);

        System.out.println("Size of ArrayList: " + numbers.size());
    }
}