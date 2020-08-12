package fatihustunyer;

import java.util.Scanner;

public class MaxMinDegerArasiniYazdirma {

	public static void main(String[] args) {
		// Kullanıcıdan min ve max değer isteyelim ve aralarındaki sayıları ekrana yazdıralım.

		Scanner scan= new Scanner(System.in);
		System.out.println("Minimum deger giriniz");
		int min=scan.nextInt();//15
		System.out.println("Maksimum deger giriniz");
		int maks=scan.nextInt();//2
		if(min==maks) {
			System.out.println("maksimum deger buyuk olmalidir");
			maks=scan.nextInt();
		}
		
		
		int degistir=0;
		if(min>maks) {
			degistir=min;
			min=maks;
			maks=degistir;
		}	
		
		for (int i = min; i <=maks; i++) {
			System.out.print(i+" ");
		}
		
		
		scan.close();
	}

}
