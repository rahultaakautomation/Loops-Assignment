package pkg1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int i;
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the number");
		 int a =obj.nextInt();
	
		for (i=1;i<=10;i++)
		{
			int n = a*i;
			System.out.println(a+"*"+i+"="+n);
		}
		
	}
}
