package pkg1;

import java.util.Scanner;
//swap numbers without using third variable

public class Swap2 {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the value of a ");
		int a = obj.nextInt();
		System.out.println("enter the value of b ");
		int b = obj.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a is = "+a);
		System.out.println("value of b is = "+b);
		}

}
