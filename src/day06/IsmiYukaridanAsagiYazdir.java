package day06;

import java.util.Scanner;

public class IsmiYukaridanAsagiYazdir {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str =input.next();
				
		stringSutun(str);
		
		input.close();
		
	}
		public static void stringSutun(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
			
		}
		
	}
	
	


