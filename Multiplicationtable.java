package thursdaylab13july;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number:");
     int num=sc.nextInt();
     System.out.print("Enter range:");
     int range=sc.nextInt();
     int i =1;
     //while loop
     while(i<=range)
     {
    	 System.out.print(num+"*"+i+"="+num*i);
    	 i++;
     }
     
	}

}
