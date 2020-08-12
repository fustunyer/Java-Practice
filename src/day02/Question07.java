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
		
		String result = harf>='a'&&harf<='z' ? "küçük harf" :  harf>='A'&&harf<='Z' ? "büyük harf": 
				"geçersiz harf";
		System.out.println(result);
		scan.close();
		
		
		if (harf>='a'&&harf<='z') {
			System.out.println("küçük harf");
			}else if (harf>='A'&&harf<='Z') {
				System.out.println("büyük harf");
			}else {
				System.out.println("hatalý giriþ yaptýnýz");
			}
						
	}

}
