package day01;

import java.util.Scanner;

public class PracticeOdev {

	public static void main(String[] args) {
		/* Kullanýcýdan 2 tane sayý alalým ve çarpma ve bölme iþlemi yaptýrýp ekrana yazdýralým
		 * 
		 * 1. Adým : Scanner class'ýndan nesne üretelim.
		 * 2. Adým : Kullanýcýdan 2 tane sayý isteyelim.
		 * 3. Adým : Aldýðýmýz sayýlarý birbiriyle çarpalým ve bölelim.
		 * 4. Adým : Bunu ekrana yazdýralým.
		 * */

		Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi yaziniz");
        int sayi1 = scan.nextInt();
        System.out.println("Bir sayi daha yaziniz");
        int sayi2 = scan.nextInt();
        double carpmaSonucu = sayi1 * sayi2;
        System.out.println("Carpma Sonucu : " + carpmaSonucu);
        double bolmeSonucu = sayi1 / sayi2;
        System.out.println("Bolme Sonucu : " + bolmeSonucu);
        
scan.close();
		
		
		
		
	}

}
