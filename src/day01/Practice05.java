package day01;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/* Basit bir bilgi tablosu oluþturalým.
		 * 
		 * 1. Adým : Scanner classtan nesne üretelim.
		 * 2. Adým : Kullanýcýdan isim alalým.
		 * 3. Adým : Kullanýcýdan soyisim alalým.
		 * 4. Adým : Kullanýcýdan, boy bilgisi alalým.
		 * 5. Adým : Kullanýcýdan, kilo bilgisi alalým.
		 * 6. Adým : Kullanýcýdan, hobi bilgisi alalým.
		 * 
		 * Not : Tüm iþlemleri variable(deðiþken) kullanarak yapýn.
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi ve soyisminizi yazýnýz:");
		String isimSoyisim=scan.nextLine();
		
		System.out.println("boyunuzu yazýnýz: ");
		short boy=scan.nextShort();
		
		System.out.println("kilonuzu yazýnýz:");
		float kilo=scan.nextFloat();
		
		System.out.println("hobilerinizi yazýnýz");
		scan.nextLine();
		String hobiler=scan.nextLine();
		
		System.out.println(isimSoyisim);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobiler);
		
			
		scan.close();
			
		

	}

}
