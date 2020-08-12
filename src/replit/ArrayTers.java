package replit;

import java.util.Arrays;

public class ArrayTers {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		 
	    System.out.println(Arrays.toString(reverse(arr)));
		  
	  }
	  public static int[] reverse(int[] arr) {
		int ters []=new int[arr.length];
		
			for (int j = 0; j < ters.length; j++) {
				for(int i=arr.length-1; i>=0; i--)
					ters[j]=arr[i];
			}
		return  ters;
		}
		

	}
