class Relational_operator {

    public static void main(String[] args) {

       int num1 = 10;
       int num2 = 25;

       System.out.println("--------Relational operators Demo ---------");
       System.out.println("Num 1 is: "+num1);
       System.out.println("Num 2 is: "+num2);

       boolean isEqual = (num1 == num2);
       System.out.println("Num1 == Num2: "+isEqual);

       boolean notEqual = (num1 != num2);
       System.out.println("Num1 != Num2: "+notEqual);

       boolean greater = (num1 > num2);
       System.out.println("Num1 > Num2: "+greater);

        boolean lesser = (num1 < num2);
        System.out.println("Num1 < Num2: "+lesser);

        boolean great_equal = (num1 >= num2);
        System.out.println("Num1 >= Num2: "+great_equal);

        boolean less_equal = (num1 <= num2);
        System.out.println("Num1 <= Num2: "+less_equal);
    }
}

