package day01;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/* Basit bir bilgi tablosu olu�tural�m.
		 * 
		 * 1. Ad�m : Scanner classtan nesne �retelim.
		 * 2. Ad�m : Kullan�c�dan isim alal�m.
		 * 3. Ad�m : Kullan�c�dan soyisim alal�m.
		 * 4. Ad�m : Kullan�c�dan, boy bilgisi alal�m.
		 * 5. Ad�m : Kullan�c�dan, kilo bilgisi alal�m.
		 * 6. Ad�m : Kullan�c�dan, hobi bilgisi alal�m.
		 * 
		 * Not : T�m i�lemleri variable(de�i�ken) kullanarak yap�n.
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi ve soyisminizi yaz�n�z:");
		String isimSoyisim=scan.nextLine();
		
		System.out.println("boyunuzu yaz�n�z: ");
		short boy=scan.nextShort();
		
		System.out.println("kilonuzu yaz�n�z:");
		float kilo=scan.nextFloat();
		
		System.out.println("hobilerinizi yaz�n�z");
		scan.nextLine();
		String hobiler=scan.nextLine();
		
		System.out.println(isimSoyisim);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobiler);
		
			
		scan.close();
			
		

	}

}
