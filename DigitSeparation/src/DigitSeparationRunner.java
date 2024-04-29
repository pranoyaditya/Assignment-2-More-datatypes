import java.util.Scanner;

public class DigitSeparationRunner {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DigitSeparation digitSeparation = new DigitSeparation();

        System.out.print("\nEnter a number: ");
        int number = sc.nextInt();

        String st = digitSeparation.separator(number);
        System.out.print("Your sequence is: ");
        digitSeparation.sequencePrinter(st);

        sc.close();
    }
}
