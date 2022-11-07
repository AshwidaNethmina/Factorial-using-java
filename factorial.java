import java.util.Scanner;

public class factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n---This program calculates factorial---\nEnter the number you want to find factorial: ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" is "+find_factorial(n));
	}
	
	static int find_factorial(int num)
	{
		if(num == 0)
			return 1;
		else
			return num*find_factorial(num-1);
	}
}