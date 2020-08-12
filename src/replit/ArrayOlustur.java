package replit;

import java.util.Arrays;

public class ArrayOlustur {

	public static void main(String[] args) {
		  System.out.println(Arrays.toString(arrayOfMultiples(7,5)));//[7 14 21 28 35]
		    
	  }
	  public static int[] arrayOfMultiples(int num, int length) {
	    int [] arr = new int[length];
	    for(int i=0; i<length ; i++){
	      arr[i]=num+i*num;
	    }
	    return arr;
	  }
	

	}


