package thursdaylab13july;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double radius, area, circumference;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Radius of Circle");
       radius = in. nextDouble();
       // Calculate area of circle and circumstances
       area= Math.PI * radius * radius;
       circumference= 2* Math.PI * radius;
       
       System.out.println("Area of Circle :"+ area);
       System.out.println("Circumference of Circle:"+ circumference);
       
       
	}

}
