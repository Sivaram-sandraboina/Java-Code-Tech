package com.sivaram.strings;
/**
 * Program:AscendingOrderString
 * Author: Sivaram
 * Day: 21
 * Description: HELP TO USER  TO Print Ascending Order String . 
 */
import java.util.Scanner;
import java.util.*;
public class AscendingOrderString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		str = str.replace(" ", "").toLowerCase();
		char []a  = str.toCharArray();
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

		scan.close();

	}

}
