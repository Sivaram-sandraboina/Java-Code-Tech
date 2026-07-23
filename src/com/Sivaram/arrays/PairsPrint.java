package com.sivaram.arrays;
/**
 * Program: PairsPrint
 * Author: Sivaram
 * Day: 07
 * Description: HELP TO USER  TO Print Pairs FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class PairsPrint {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("ENTER NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
		 int number = scan.nextInt();
		 System.out.println("ENTER THE ELEMENTS HERE : ");
		 int[]ar = new int[number];
		 for(int i = 0 ; i<ar.length;i++) {
			 ar[i]=scan.nextInt();
		 }
		 System.out.println("ALL POSSIBILITY PAIRS :  ");
		 for(int i = 0;i<ar.length;i++) {
			 for(int j = 0;j<ar.length;j++) {
				 System.out.println(ar[i]+" "+ar[j]);
			 }
		 }
           scan.close();
	}
	

}
