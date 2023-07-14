package friday;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,digit,sum=0;
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a number:");
       num= sc.nextInt();
    		   
       
       while(num!=0)
       {
    	digit=num%10;
    	sum=sum+digit;
    	num=num/10;
       }
       System.out.println("\nsum of Digits =" +sum);
	}

}
