package thursdaylab13july;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i, factorial=1, number;
        System.out.println("Enter the number for find factorial:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(i =num; i>=1; i--)
        {
        	 factorial = factorial * i;
	
        }
        System.out.println("\nFactorial of the given number is:: "+factorial);
        }
       
	}


