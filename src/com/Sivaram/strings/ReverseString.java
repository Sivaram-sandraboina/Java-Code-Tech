package com.sivaram.strings;
/**
 * Program: ReverseString
 * Author: Sivaram
 * Day: 13
 * Description: HELP TO USER  TO Print Reverse String . 
 */
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("ENTER THE STRING HERE : ");
      String str  = scan.nextLine();
      String s = "";
      for(int  i  = str.length()-1 ; i>=0;i--) {
    	  char ch = str.charAt(i);
    	  s= s+ch;
      }
      System.out.println(s);
      scan.close();

	}

}
