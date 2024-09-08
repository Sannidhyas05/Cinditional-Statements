import java.util.Scanner;

public interface leap {
    public static boolean leap_year(int year)
    {
        if(year%4 == 0)
        {
            if(year%100 == 0)
            {
                if(year%400 != 0)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leap_year(year));
    }
}
