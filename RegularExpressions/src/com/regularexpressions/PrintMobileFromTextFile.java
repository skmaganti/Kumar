package com.regularexpressions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintMobileFromTextFile {

	public static void main(String[] args) throws IOException {
		Pattern p = Pattern.compile("(0|9)?[7-9][0-9]{9}");
		PrintWriter pw = new PrintWriter("output.txt"); //To write data to the file. Whereever you want to write the data use this method
		BufferedReader br = new BufferedReader(new FileReader("input.txt")); //Whereever reading data is there best concept is BufferedReader
		String line = br.readLine(); //I got first line from the input
		while(line!=null) {
			Matcher m = p.matcher(line);
			while(m.find()) { //There can be repeated numbers so whenever the match is there print in output file
				pw.println(m.group());
			}
			line = br.readLine();
		}
		pw.flush();
	}

}
//BufferedReader can't communicate with the file directly so FileReader method is used