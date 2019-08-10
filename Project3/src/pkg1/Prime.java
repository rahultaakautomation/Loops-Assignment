package pkg1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enter the number");
		int n=r.nextInt();
	
		
		for ( int i=2;i<=n-1;i++)
		{
			if (n%2==0)
			{
				System.out.println("number is not prime");
				break;
			}
			else
			{
				System.out.println("number is prime");
				break;
			
			}
		}
				{
	}

}
}