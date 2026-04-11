package April_11_2025;

import java.util.Scanner;

public class profitloss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter selling price : ");
		int sp = sc.nextInt();
		System.out.println("Enter cost price : ");
		int cp = sc.nextInt();
		
//		profitloss obj = new profitloss();
//		obj.calculate(cp,sp);
		calculate(cp, sp);
		
	}
	
	static void calculate(int cost_price,int selling_price) {
		
		if(selling_price>cost_price) {
			double profit = selling_price - cost_price;
			System.out.println("profit : " + profit);
		}
		else if(selling_price<cost_price) {
			double loss = cost_price - selling_price;
			System.out.println("loss : " + loss);
		}else
			System.out.println("no profit or no losss : ");
	}
}
