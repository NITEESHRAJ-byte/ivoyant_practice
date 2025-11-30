import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        ArrayList<String> studentDetails = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of student Details You want to add: ");
        int size = sc.nextInt();
        String[] students = new String[size];
        for (int i = 0;i<size;i++){
            students[i] = sc.nextLine();
        }
        for (String student: students){
            studentDetails.add(student);
        }
        System.out.println("The total number of students are: " + studentDetails.size());
        System.out.println("The final Details of students: " + studentDetails);

        System.out.println("If you want to edit any record number , please enter the record number: ");
        int recordNum = sc.nextInt();
        System.out.println("Enter the Student updated name: ");
        String updatedName = sc.nextLine();
        studentDetails.set(recordNum, updatedName);

        System.out.println("The updated student record at: "+recordNum+" is: "+studentDetails.get(recordNum));
    }
}