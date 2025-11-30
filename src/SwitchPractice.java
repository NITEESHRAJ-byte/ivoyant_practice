import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Country Code");
        int country_code = sc.nextInt();

        switch (country_code) {
            case 91:
                System.out.println("You from INDIA");
                break;
            case 1:
                System.out.println("You from USA");
                break;
            case 44:
                System.out.println("You from United Kingdom");
                break;
            case 61:
                System.out.println("You from Australia");
                break;
            case 86:
                System.out.println("You from China");
                break;
            case 81:
                System.out.println("You from Japan");
                break;
            case 49:
                System.out.println("You from Germany");
                break;
            case 33:
                System.out.println("You from France");
                break;
            case 7:
                System.out.println("You from Russia");
                break;
        }
    }
}
