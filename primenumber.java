package April_2_2k26;

import java.util.Scanner;

public class primenumber {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your number: ");
			int num = sc.nextInt();
			boolean isprime = true;
			
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				isprime = false;
			}
			
			if(isprime==true)
			{
				System.out.println("the given number is prime number....");
			}else
				System.out.println("the given number is not prime nbumber..");
		}
	
	
	
}
