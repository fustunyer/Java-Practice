package day02;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 5 basamaklı sayı alalım, 
		 *  ilk 2 ve son 2 basamaklarındaki sayıların
		// sayı değerlerini toplayalım
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("5 basamaklı bir sayı giriniz");
		int s1=scan.nextInt();
		
		/*int a1=s1%10;
		int a2=(s1/10)%10;
		int a3=(s1/1000)%10;
		int a4=(s1/10000)%10;
		System.out.println(a1+a2+a3+a4);
		*/
		int ilkiki=s1/1000;
		int soniki=s1%100;
		int ilkikitoplamı=(ilkiki%10)+(ilkiki/10);
		int sonikitoplamı=(soniki%10)+(soniki/10);
		System.out.println("sayıların toplamı: "+(ilkikitoplamı+sonikitoplamı));
				
		scan.close();		
	}

}
