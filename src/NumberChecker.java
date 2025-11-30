//I created this code to demonstrate the Operators, If-else, nested if

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        sc.nextLine();

        if(number < 0){
            System.out.println("Your entered number "+number+" is a negative number: ");
        }
        else if(number > 0){
            System.out.println("Your entered number "+number+" is a positive number: ");
        }
        else{
            System.out.println("The Entered number is Zero");
        }

//        if(number % 2 == 0){
//
//            if(number > 0){
//                System.out.println("Your entered number "+number+" is Positive even number : ");
//            }
//            else if(number < 0){
//                System.out.println("Your entered number "+number+" is Positive even number : ");
//            }
//            else{
//                System.out.println("The Entered number is Zero");
//            }
//        }
//        else{
//            if(number > 0){
//                System.out.println("Your entered number "+number+" is Positive odd number : ");
//            }
//            else if(number < 0){
//                System.out.println("Your entered number "+number+" is Negative odd number : ");
//            }
//            else{
//                System.out.println("The Entered number is Zero");
//            }
        if(number > 0 && number % 2 == 0){
            System.out.println("Your entered number "+number+" is Positive even number : ");
        }
        else if(number < 0 && number % 2 == 0){
            System.out.println("Your entered number "+number+" is Negative even number : ");
        }
        else if(number > 0 && number % 2 != 0){
            System.out.println("Your entered number "+number+" is Positive odd number : ");
        }
        else if(number < 0 && number % 2 != 0){
            System.out.println("Your entered number "+number+" is Negative odd number : ");
        }
        else{
            System.out.println("The entered number is Zero");
        }


    }

}
