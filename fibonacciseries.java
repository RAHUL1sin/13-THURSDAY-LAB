package friday;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit,num1=0,num2=1,i,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of digit for fibonacci series:");
		digit=sc.nextInt();
		System.out.println(num1+"\n"+num2);
		for(i=1;i<=digit-2;i++)
		{
			result=num1+num2;
			System.out.println(result);
			num1=num2;
			num2=result;
		}
	}

}
