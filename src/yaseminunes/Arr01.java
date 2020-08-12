package yaseminunes;

import java.util.Arrays;

public class Arr01 {

	public static void main(String[] args) {
		// Bir elemanin varligini kontrol etme
		
		int arr[]= {2,1,7,6};
		Arrays.sort(arr);//[1,2,6,7]
		System.out.println(Arrays.binarySearch(arr,2));
		System.out.println(Arrays.binarySearch(arr,6));//
		
		System.out.println(Arrays.binarySearch(arr,9));//-5
		
		
		
		
		

	}

}
