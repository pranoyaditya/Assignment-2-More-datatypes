import java.util.Scanner;

public class TransformNumberToMonthNameRunner {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TransformNumberToMonthName transformNumberToMonthName = new TransformNumberToMonthName();

        System.out.print("\nEnter a number between 1 to 12: ");
        int number = sc.nextInt();

        if(number >= 1 && number <= 12)
        {
            String monthName = transformNumberToMonthName.getMonthName(number);

            System.out.println("Month name: " + monthName);
        }
        else
        {
            System.out.println("Wrong input!");
        }

        sc.close();
    }
}
