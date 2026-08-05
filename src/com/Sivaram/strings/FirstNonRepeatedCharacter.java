package com.sivaram.strings;
/**
 * Program: FirstNonRepeatedCharacter
 * Author: Sivaram
 * Day: 20
 * Description: HELP TO USER  TO Print First Non Repeated Character . 
 */
import java.util.Scanner;
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		int count = 0;
		for(int i = 0 ;i<str.length();i++) {
			count = 0;
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(str.charAt(i)+" ");
				scan.close();
				return;
			}
		}
		scan.close();

	}

}
