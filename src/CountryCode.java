//I created this code to demonstrate the if else

import java.util.Scanner;
public class CountryCode {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int countryCode ;
        int stateCode;
        int cityCode;

        //IF
        System.out.println("Enter the countryCode 91 for INDIA");
        countryCode = sc.nextInt();
        if(countryCode == 91){
            System.out.println("Country : INDIA");
        }

        //IF-ELSE
        System.out.println("Enter the stateCode");
        stateCode = sc.nextInt();
        if(stateCode == 29){
            System.out.println("State : Karnataka");
        }
        else{
            System.out.println("State Unknown");
        }

        //Nested if
        System.out.println("Enter the cityCode");
        cityCode = sc.nextInt();
        if(countryCode == 91){
            if(stateCode == 29){
                if(cityCode == 1){
                    System.out.println("CIty : SHIVAMOGGA");
                }
                else{
                    System.out.println("City Unknown");
                }
            }
        }
    }
}
