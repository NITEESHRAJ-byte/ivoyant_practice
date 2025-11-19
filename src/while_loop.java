import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Pincode = 1234;
        System.out.println("Enter the ATM pincode");
        int EnteredCode = sc.nextInt();

        while(EnteredCode != Pincode){
            System.out.println("Wrong pin entered\nPlease try again");
            EnteredCode = sc.nextInt();
        }
        System.out.println("Access granted!!");
    }
}
