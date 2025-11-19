class Main{
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 6;
        int num3 = ++num1;
        int num4 = num1++;
        System.out.println("Pre Increment: "+num3+" Post Increment: "+num4);
        int num5 = --num2;
        int num6 = num2--;
        System.out.println("Pre Decrement: "+num5+" Post Decrement: "+num6);

    }
}