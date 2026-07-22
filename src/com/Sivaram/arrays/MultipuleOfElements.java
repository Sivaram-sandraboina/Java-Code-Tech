package com.sivaram.arrays;
/**
 * Program: MultipuleOfElements
 * Author: Sivaram
 * Day: 06
 * Description: HELP TO USER  TO GET MultipuleOfElements VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class MultipuleOfElements {

	public static void main(String[] args) {
      		 Scanner scan = new Scanner(System.in);
      		 System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
      		 int number = scan.nextInt();
      		 int[]ar = new int[number];
      		 System.out.println("ENTER THE ELEMENTS HERE : ");
      		 for(int i = 0;i<ar.length;i++) {
      			 ar[i]=scan.nextInt();
      		 }
      		 System.out.println("ENTER WHICH NUMBER MULTIPLAY YOU WANT HERE :  ");
      		 int multiplay = scan.nextInt();
      		 System.out.println("YOUR EXPECTED OUT PUT IS : ");
      		 for(int i = 0 ; i<ar.length;i++) {
      			 System.out.print(ar[i]*multiplay+" ");
      		 }
      		 scan.close();

	}

}
