package ru.sds.IOTest;
import java.util.Scanner;

public class SumString {

		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);
		        int buffSize = scanner.nextInt();
		        scanner.nextLine();
		        String buff  = scanner.nextLine();
		        
		     
		        String[] arr = buff.split(" ");
		        int sum=0;
		        
		        for(int i =0;i<buffSize;i++) {
		        	 sum =sum+ Integer.parseInt(arr[i]);
		        }
		        
		        System.out.println(sum);
		     
		    }
		

	
}
