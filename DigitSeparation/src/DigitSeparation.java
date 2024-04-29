// This class does the following:
// Breaks the input number into individual digits and displays them as a sequence.


public class DigitSeparation {
    
    // returns a string after breaking the number.
    public String separator(int number)
    {
        String ans = Integer.toString(number);

        return ans;
    } 

    // prints the sequence after separation.
    public void sequencePrinter(String st)
    {
        for(int i=0; i<st.length(); i++)
        {
            System.out.print(st.charAt(i) + " ");
        }
        System.out.println();
    }
}
