package April_3_2k26;

public class palindrome {
	public static void main(String[] args) {
		
		int num=121;
		int orignal=num;
		int sum=0;
		int digit=0;
		while(num>0) {
			 digit = num%10;  //1,2,1
			 sum = (sum*10) + digit;//1,12,121
			 num = num/10;//12,1
		}

		
		if(orignal==sum)
		{
			System.out.println("palindrome");
		}else
			System.out.println("not");
	}
}
