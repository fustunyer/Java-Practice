package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/*
		 *  Kullanýcdan alýnan sayýnýn negatif ,
		 *  pozitif yada notr olma durumunu konrtol eden ternary yazalým
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int s=scan.nextInt();
		
		String result=s>0 ? "pozitif" : s==0 ? "nötr": "negatif";
		System.out.println(result);
		
			
		scan.close();
	}

}
