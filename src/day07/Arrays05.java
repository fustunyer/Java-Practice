package day07;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		//Arrays elemanlarinda en buyugunu bulan methodu bulunuz
		
		int []arr= {12,54,53,23};
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Arrayin en buyuk elemani: "+max);
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		

	}

}
