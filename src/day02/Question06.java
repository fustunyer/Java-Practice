package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/*
		 *  Kullan�cdan al�nan say�n�n negatif ,
		 *  pozitif yada notr olma durumunu konrtol eden ternary yazal�m
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int s=scan.nextInt();
		
		String result=s>0 ? "pozitif" : s==0 ? "n�tr": "negatif";
		System.out.println(result);
		
			
		scan.close();
	}

}
