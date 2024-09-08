import java.util.Scanner;

public class Week {
    public static String day(int num)
    {
        if(num>=1 && num<=7)
        {
            switch (num){
                case 1: return "Sunday";
                case 2: return "Monday";
                case 3: return "Tuesday";
                case 4: return "Wednesday";
                case 5: return "Thursday";
                case 6: return "Friday";
                case 7: return "Saturday";
            }
        }
        return "enter valid day";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        System.out.println(day(days));
    }
}
