package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("harf giriniz");
		char harf=scan.next().charAt(0);
		
		String result = harf>='a'&&harf<='z' ? "k���k harf" :  harf>='A'&&harf<='Z' ? "b�y�k harf": 
				"ge�ersiz harf";
		System.out.println(result);
		scan.close();
		
		
		if (harf>='a'&&harf<='z') {
			System.out.println("k���k harf");
			}else if (harf>='A'&&harf<='Z') {
				System.out.println("b�y�k harf");
			}else {
				System.out.println("hatal� giri� yapt�n�z");
			}
						
	}

}
