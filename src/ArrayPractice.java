import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args){
        final int size = 10; // size cant be altered its constant
        int []arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the array");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Entered elements of the array are: ");
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
        sc.close();
    }

}
