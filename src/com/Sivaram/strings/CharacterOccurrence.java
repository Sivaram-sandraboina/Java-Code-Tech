package com.sivaram.strings;
/**
 * Program: CharacterOccurrence
 * Author: Sivaram
 * Day: 23
 * Description: HELP TO USER  TO Print Character Occurrence . 
 */
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class CharacterOccurrence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		LinkedHashMap<Character,Integer>map  = new LinkedHashMap<>();
		for(char ch :str.toCharArray())
		{
			if(ch==' ') {
				continue;
			}
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		scan.close();
	}

}
