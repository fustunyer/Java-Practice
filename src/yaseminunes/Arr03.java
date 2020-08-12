package yaseminunes;

import java.util.Arrays;

public class Arr03 {

	public static void main(String[] args) {
		//Bir Arrayin elemanlarini tersten yazdirma
		int arr []= {2,11,0,23,7};
		Arrays.sort(arr);
		for (int i = arr.length-1 ; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
