// This class removes comma from user input.

public class PunctuationRemoval {
    
    // returns a string after removing commas from the input string.
    public String removalOperation(String st)
    {
        String ans = "";

        for(int i=0; i<st.length(); i++)
        {
            if(st.charAt(i) != ',')
            {
                ans = ans + st.charAt(i);
            }
        }

        return ans;
    }
}
