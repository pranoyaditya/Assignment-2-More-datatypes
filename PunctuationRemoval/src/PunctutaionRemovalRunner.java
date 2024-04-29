import java.util.Scanner;

public class PunctutaionRemovalRunner {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PunctuationRemoval punctuationRemoval = new PunctuationRemoval();
        
        System.out.print("\nPlease enter an integer between 1,000 and 999,999: ");
        String st = sc.next();

        System.out.println("After removing commas from the input, the string is: " + punctuationRemoval.removalOperation(st));

        sc.close();
    }
}
