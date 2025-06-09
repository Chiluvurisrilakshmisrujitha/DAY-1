import java.util.Scanner;
class CheckPrime
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean prime = true;

        if (number <= 1)
       {
            prime = false;
        }
	 else
	 {
            for (int i = 2; i <= number / 2; i++) 
	    {
                if (number % i == 0) 
                {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
        {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}