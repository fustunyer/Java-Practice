package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// Girilen ifadeyi Array kullanarak tersini yazdiralim
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir yazi giriniz");
		String str=input.next();
		char [] arr = str.toCharArray();
		
		String tersi = "";
		
		for (int i = arr.length-1; i >=0; i--) {
			tersi+=arr[i];
		}
		System.out.println("Girilen yazinin ters yazimi: "+ tersi);
		
	int [] numArr= {1,2,3,4,5,6,7};
	System.out.println(Arrays.toString(numArr));	
	for(int i=0; i<numArr.length/2;i++) {
		int temp=numArr[i];
		numArr[i]=numArr[numArr.length-i-1];
		numArr[numArr.length-i-1]=temp;	
	}
	System.out.println(Arrays.toString(numArr));	
		
		input.close();
	}
	

}
