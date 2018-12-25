package ru.sds.IOTest;


import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class CheckEmail {
	
	 public static boolean isValidEmailAddress(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(email);
         return m.matches();
  }
	
	public static void main(String[] args) throws IOException {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите Email: ");
		
		str=sc.nextLine();
		
		System.out.println(isValidEmailAddress(str));
		
		char[] chArray = str.toCharArray();
		
		FileWriter dstr = new FileWriter("/Users/shheglov/Desktop/вопросы.txt", true);
		if(isValidEmailAddress(str)==true) {
		dstr.write(str);
		dstr.write(10);
		dstr.flush();
		dstr.close();
		}else {System.out.println("Введет не правильный Email!!!");}
	}
	
	
}
