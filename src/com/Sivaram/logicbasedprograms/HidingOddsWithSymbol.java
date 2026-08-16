package com.sivaram.logicbasedprograms;
/**
 * Program: HidingOddsWithSymbol
 * Author: Sivaram
 * Day: 30
 * Description: HELP TO USER  TO Hiding Odds With Symbol. 
 */
import java.util.Scanner;
public class HidingOddsWithSymbol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS HERRE : ");
		int[]ar = new int[n];
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		for(int i = 0 ;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				System.out.print("# ");
			}
			else {
				System.out.print(ar[i]+" ");
			}
		}
		scan.close();

	}

}
