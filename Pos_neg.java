// check if a number is positive or not

import java.util.Scanner;

class Pos_neg{
    public static String check(int num)
    {
        if(num>=0)
        {
            return "positive";
        }
        return "negative";
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check(num));
    }
}