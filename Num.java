class Num
{
public static void main(String args[])
	{
		int[] arr = {1, 0, 1, 0, 0, 1};
		int n = arr.length;
        	int count = 0;
        	int result = 0;
        	for (int i = n - 1; i >= 0; i--)
		{
			if (arr[i] == 0)
			{
                		count++;
            		} 
			else if (arr[i] == 1)
			{
                		result += count;
            		}
        	}
		System.out.println(result);
    	}
}