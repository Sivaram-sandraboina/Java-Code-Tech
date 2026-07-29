package com.sivaram.strings;
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
