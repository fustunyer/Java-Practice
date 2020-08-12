package day06;

import java.util.Scanner;

public class RakamlariToplami {

	public static void main(String[] args) {
		//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		int sayi=scan.nextInt();
	System.out.println("Sayinin rakamlari toplami= "+rakamlariToplami(sayi));
		
		scan.close();
	}
		public static int rakamlariToplami(int sayi) {
			int toplam=0;
			int birlerbasamagi=0;
			
			while(sayi>0) {
				birlerbasamagi =sayi%10;
				toplam+=birlerbasamagi;
				sayi=sayi/10;		
			}
				
			return toplam;
		}
	
}
