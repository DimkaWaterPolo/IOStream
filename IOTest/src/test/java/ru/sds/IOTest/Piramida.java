package ru.sds.IOTest;

public class Piramida {

public static void main(String[] args) {
	 int[] tab = new int[9];

	    for(int row = tab.length; row > 0; row--) {

	        tab[row-1] = row;

	        //Print left
	        for(int i=0; i < tab.length; i++) {
	            if(tab[i] != 0) {
	                System.out.print(tab[i]);
	            } else {
	                System.out.print(' ');
	            }
	        }
	        //Print right
	       /* for(int i= tab.length-2; i >= row - 1; i--) {
	            if(tab[i] != 0) {
	                System.out.print(tab[i]);
	            }
	        }*/

	        System.out.println("");

	    }

}
}
