package day02;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan 5 basamaklý sayý alalým, 
		 *  ilk 2 ve son 2 basamaklarýndaki sayýlarýn
		// sayý deðerlerini toplayalým
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("5 basamaklý bir sayý giriniz");
		int s1=scan.nextInt();
		
		/*int a1=s1%10;
		int a2=(s1/10)%10;
		int a3=(s1/1000)%10;
		int a4=(s1/10000)%10;
		System.out.println(a1+a2+a3+a4);
		*/
		int ilkiki=s1/1000;
		int soniki=s1%100;
		int ilkikitoplamý=(ilkiki%10)+(ilkiki/10);
		int sonikitoplamý=(soniki%10)+(soniki/10);
		System.out.println("sayýlarýn toplamý: "+(ilkikitoplamý+sonikitoplamý));
				
		scan.close();		
	}

}
