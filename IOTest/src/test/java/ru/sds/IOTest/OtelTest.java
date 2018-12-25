package ru.sds.IOTest;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

	public class OtelTest {

	 

	       class Otel {

	             int pos;

	             int star;

	             int rating;

	            

	             public Otel(int pos, int rating) {

	                    this.pos = pos;

	                    this.rating = rating;

	             }

	       }

	      

	       public static void main(String[] args) {

	            

	             Scanner scanner = new Scanner(System.in);

	 

	             System.out.print("Input a number: ");

	             int buffSize = scanner.nextInt();

	             scanner.nextLine();

	            

	             System.out.print("Input a string: ");

	             String buff = scanner.nextLine();

	            

	             String[] arr = buff.split(" ");

	             int[] sourceArr = new int[buffSize];          

	             int[] sortArr = new int[buffSize];

	             OtelTest m = new OtelTest();

	             List<Otel> otels = new ArrayList<OtelTest.Otel>();

	            

	            

	             for (int i=0; i < arr.length; i++) {

	                    sourceArr[i] = Integer.parseInt(arr[i]);

	                    sortArr[i] = Integer.parseInt(arr[i]);

	                    otels.add(m.new Otel(i, Integer.parseInt(arr[i])));

	             }                  

	            

	             Arrays.sort(sortArr);

	            

	             int curStar = 1;

	             int count = buffSize/5;

	            

	             for (int i=0; i < sortArr.length; i++) {

	                   

	            

	                    for (int j=0; j < otels.size(); j++) {

	                           if (otels.get(j).rating == sortArr[i]) {

	                                 

	                                  if (count < 1) {

	                                        curStar = curStar + 1;

	                                        count = buffSize/5;

	                                  }

	                                 

	                                  otels.get(j).star = curStar;

	                                  count = count - 1;

	                                  break;

	                           }

	                    }

	             }                  

	 

	 

	             for (int i=0; i < otels.size(); i++) {

	                    System.out.print(otels.get(i).star);

	             }     

	            

	       }

	 

	}

