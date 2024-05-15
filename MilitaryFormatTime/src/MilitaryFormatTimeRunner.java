import java.util.Scanner;

public class MilitaryFormatTimeRunner {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MilitaryFormatTime militaryFormatTime = new MilitaryFormatTime();

        System.out.print("\nPlease enter the first time: ");
        String firstTime = sc.next();
        System.out.print("Please enter the second time: ");
        String secondTime = sc.next();

        System.out.println("\n" + militaryFormatTime.getDuration(firstTime, secondTime));


        sc.close();
    }
}
