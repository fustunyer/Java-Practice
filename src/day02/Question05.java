package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * / Kullan�c�dan  y���n� ve kilosunu alal�m
		// 18 ya��ndan k���k ise kan ba���� yapamaz
		// 18 ya��ndan b�y�k ve 50 kilo dan hafif ise kan ba���� yapamaz.
		// 18 ya��ndan b�y�k ve 50 kilodan a��r ise kan ba���� yapabilir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen ya��n�z� giriniz");
		int yas=scan.nextInt();
		
		/*if(yas>18) {
			System.out.println("l�tfen kilonuzu giriniz");
			int kilo=scan.nextInt();
			if(kilo>50) {
				System.out.println("kan verebilirsiniz.");
			}else {
				System.out.println("50 kilodan hafifler kan ba���� yapamaz.");
			}
		} else {
				System.out.println("18 ya��ndan k���kler kan ba���� yapamaz");
			}
			*/
		System.out.println("l�tfen kilonuzu giriniz");
		int kilo=scan.nextInt();
		
		String result = yas>18 ? kilo>50 ? "kan verebilirsiniz" : "kan vermek i�in 50 kilodan fazla olamal�s�n�z." :
									"18 ya��ndan k���kler kan veremezler..";
		System.out.println(result);
				
		scan.close();
				
		}
		

	}


