package ru.sds.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class IORead {

	public static void copy(InputStream scr, OutputStream dsr) throws IOException {
		while(true) {
			int data = scr.read();
			if(data != -1) {
				dsr.write(data);
				
			}else return;
		}
	}
	
	
	public static void main(String[] args) throws IOException  {
		InputStream scr;
		try {
			scr = new URL("https://www.google.ru/adafda").openStream();
			copy(scr, System.out);
		} catch (FileNotFoundException e1) {
			FileWriter fileWriter = new FileWriter("/Users/shheglov/Desktop/вопросы.txt");
			fileWriter.write(e1.toString() );
			fileWriter.close();
		} 
		
	
	}
}
