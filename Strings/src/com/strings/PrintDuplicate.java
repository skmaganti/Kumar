package com.strings;

import java.util.Scanner;

public class PrintDuplicate {

	public static void main(String[] args) {
		int count;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.nextLine();
		String words[] = str.split("");
		System.out.println("Duplicate words in a given string");
		for(int i=0;i<words.length;i++) {
			count = 1;
			for(int j=i+1;j<words.length;j++) {
				System.out.println(words[i]);
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if(count>1&&words[i]!="0") {
//			System.out.println(words[i]);
		}
		
		}
	}

}
