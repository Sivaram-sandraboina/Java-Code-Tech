package com.sivaram.arrays;
/**
 * Program: AscendingOrderElements
 * Author: Sivaram
 * Day: 06
 * Description: HELP TO USER  TO GET AscendingOrderElements VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class AscendingOrderElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
		int number = scan.nextInt();
		int []ar = new int[number];
		System.out.println("ENTER THE ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Ascending order elements: ");
		int temp = 0;
		for(int i = 0 ;  i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i = 0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		scan.close();

	}

}
