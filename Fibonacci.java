package Day6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int terms, a, b, i;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Term limit of series");
		terms =scanner.nextInt();
		a = 0;
		b=1; 
	for (i =1; i<=terms; i++)
				{
			System.out.print(a+" ");
			int fib=a+b;
			a=b;
			b=fib;
			i=i++;
				}
	
	}

}
