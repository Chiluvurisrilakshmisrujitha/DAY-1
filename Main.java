//A quick brown fox jumps over the lazy dog
public class Main
 {
    public static void main(String[] args) 
    {
        String input = "a quick brown fox jumps over the lazy dog";
        boolean[] sentence = new boolean[26]; 
        input = input.toLowerCase(); 
        for (int i = 0; i < input.length(); i++) 
	{
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z')
	    {
                sentence[ch - 'a'] = true;
            }
        }
        boolean allPresent = true;
        for (boolean b : sentence) 
	{
            if (!b)
	    {
                allPresent = false;
                break;
            }
        }

        if (allPresent)
        {
            System.out.println("yes");
        }
        else 
	{
            System.out.println("no");
        }
    }
}