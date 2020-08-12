package day07;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// 3 elemanli String array olusturun
		//elemanlarin sonuna "ly" ekleyin
		
		
		String[] str= {"clever","meek","nice"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		
		for (String w : str) {
			System.out.print(w+" ");
		}
		System.out.println(Arrays.toString(str));
		
		for (int i = 0; i < str.length; i++) {
			str[i]=str[i].concat("ly");
		}
		System.out.println(Arrays.toString(str));
		
		
		
	}

}
