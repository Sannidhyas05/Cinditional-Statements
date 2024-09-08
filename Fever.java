import java.util.Scanner;

public class Fever {
    public static String fev(double num)
    {
        if(num>100)
        {
            return "You have fever";
        }
        return "You don't have fever";
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            System.out.println(fev(num));
    }
}
