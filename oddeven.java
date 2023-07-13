package thursdaylab13july;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input= new Scanner(System.in);
   int num; // Declare a variable
   System.out.println("Enter a number:");
   num= input.nextInt();
   if (num%2==0)
	   System.out.println("enter number is even");
   else
	   System.out.println("enter number is odd");
   
	}

}
