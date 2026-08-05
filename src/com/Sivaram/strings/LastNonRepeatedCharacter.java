package com.sivaram.strings;
/**
 * Program: LastNonRepeatedCharacter
 * Author: Sivaram
 * Day: 20
 * Description: HELP TO USER  TO Print Last Non Repeated Character . 
 */
import java.util.Scanner;
public class LastNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		int count = 0;
		for(int i = str.length()-1;i>=0;i--) {
			count = 0 ;
			for(int j = str.length()-1;j>=0;j--) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(str.charAt(i));
				scan.close();
				return;

			}
		}
		scan.close();
	}

}
