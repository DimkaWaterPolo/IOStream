package ru.sds.IOTest;

import java.io.*;
import java.util.Scanner;

public class Test {
	
	public static void copy(InputStream scr, OutputStream dsr) throws IOException {
		while(true) {
			int data = scr.read();
			if(data != -1) {
				dsr.write(data);
				
			}else return;
		}
	}
   public static void main(String args[]) throws IOException {
     String Str = new String("");

      Scanner sc = new Scanner(System.in);
      System.out.println("Введите любые 2 слова или фразу: ");
      
      OutputStream dstr = new FileOutputStream("/Users/shheglov/Desktop/Книга2.xls");
      String str;
      while((str=sc.nextLine()) !="") {
    	  dstr.write(str.getBytes());
    	  dstr.write(10);
    	  
      }
    /*  
      String phrase1 = sc.nextLine();
      System.out.println(phrase1);
      phrase1 = sc.nextLine();
      System.out.println("\n" );
      
      
     // for (String retval : phrase1.split("\n")) {
       // System.out.println(retval);
      //}
	/*   InputStream targetStream = new ByteArrayInputStream(phrase1.getBytes());
	   //InputStream targetStream = new FileInputStream("/Users/shheglov/Desktop/ЭЦП/доки для ЭЦП/IP.xlsx");
      OutputStream dstr = new FileOutputStream("/Users/shheglov/Desktop/Книга2.xls");
      copy(targetStream, dstr);*/
     
    }
}
