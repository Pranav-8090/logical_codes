package April_4_2k26;
import java.util.*;
public class armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		int original = num;
		int sum=0;
		
		while(num>0)
		{
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num/10;
		}
		
		if(sum == original)
		{
			System.out.println("The given number is armstrong : ");
		}else
			System.out.println("The given number is not a armstrong : ");
	}
	
	
	

}
