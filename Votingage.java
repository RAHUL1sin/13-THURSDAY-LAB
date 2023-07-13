package thursdaylab13july;

import java.util.Scanner;

public class Votingage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age;
     Scanner sc= new Scanner(System.in);
     System.out.print("ENTER YOUR AGE=");
     age = sc.nextInt();
     if (age >=18)
     {
         System.out.println("You are eligible for vote.");
     }
     else
     {
    	 System.out.println("YOU ARE NOT ELIGIBLE FOR VOTE.");
    	 
     }
    	 
    	 
     
    	 
	}

}
