package day08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanlariniSirala {

	public static void main(String[] args) {
		// Array elemanlarini siralayan bir kod yazalim
		Scanner input = new Scanner(System.in);
		System.out.println("lutfen array elemanlarini giriniz.");
		//int num =input.nextInt();
		int []arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String [] str = {"Java","C#","Python","C++"};
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		
		input.close();
		

	}

}
