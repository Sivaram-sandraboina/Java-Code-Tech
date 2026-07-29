package com.sivaram.strings;
import java.util.Scanner;
public class SpaceCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		int count = 0;
		for(int i = 0 ;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
