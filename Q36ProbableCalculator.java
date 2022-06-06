package Assignment0606;

import java.util.Scanner;

public class Q36ProbableCalculator {
	static void probableTopperNumbers(int num)
	{
		
		int sumeven=0,sumodd=0;
		while(num>0)
		{
			int digit =num%10;
			if(digit%2==0)
			{
				sumeven +=digit;
			}
			else 
			{
				sumodd+=digit;
			}
			num=num/10;
		}
		if(sumeven==sumodd)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void main(String[] args) {
		int input;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter registration numbers : ");
		input = sc.nextInt();		
		probableTopperNumbers(input);
	}

}

