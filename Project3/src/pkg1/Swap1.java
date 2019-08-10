package pkg1;

import java.util.Scanner;
//swap of value using 3rd integer
public class Swap1 {
	
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=obj.nextInt();
		System.out.println("enter the value of b");
		int b=obj.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("value of a is = " +a);
		System.out.println("value of b is = "+b);
		
	}

}
