package com.sivaram.logicbasedprograms;
/**
 * Program: DuplicatesWithSortingOrder
 * Author: Sivaram
 * Day: 17
 * Description: HELP TO USER  TO Print Duplicates With Sorting Order . 
 */
import java.util.*;
import java.util.HashSet;
public class DuplicatesWithSortingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		int []ar = new int[n];
		System.out.println("ENTER THE ELEMENTS HERE : ");
         for(int i = 0 ; i<ar.length;i++) {
        	 ar[i]=scan.nextInt();
         }
         
         HashSet<Integer> seen = new HashSet<>();
          HashSet<Integer> duplicate =new HashSet<>();
          for(int num :ar ) {
        	  if(seen.contains(num)) {
        		  duplicate.add(num);
        	  }
        	  else {
        		  seen.add(num);
        	  }
        	  
          }
          List<Integer> res = new ArrayList<>(duplicate);
          Collections.sort(res);
          for(int num :res) {
        	  System.out.print(num+" ");
          }
          scan.close();
	}

}
