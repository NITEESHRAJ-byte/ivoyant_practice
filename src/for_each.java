import java.util.Scanner;

public class for_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Entered Elements of the Array are: ");
        for (int a : arr) {
            System.out.println(a);
        }
        sc.close();
    }
}
