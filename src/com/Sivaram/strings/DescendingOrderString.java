package com.sivaram.strings;
/**
 * Program:DescendingOrderString
 * Author: Sivaram
 * Day: 21
 * Description: HELP TO USER  TO Print Descending Order String . 
 */
import java.util.Scanner;
import java.util.Arrays;
public class DescendingOrderString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		str = str.replace(" ", "").toLowerCase();
		char []a = str.toCharArray();
		Arrays.sort(a);
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		scan.close();
	}

}
