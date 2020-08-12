package day01;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// 
		/* Kullanýcýdan 2 tane sayý alalým ve toplama iþlemi yaptýrýp ekrana yazdýralým
		 * 
		 * 1. Adým : Scanner class'ýndan nesne üretelim.
		 * 2. Adým : Kullanýcýdan 2 tane sayý isteyelim.
		 * 3. Adým : Aldýðýmýz sayýlarý toplayarak, yeni bir deðiþkene atayalým.
		 * 4. Adým : Bunu ekrana yazdýralým.
		 * 5. Adým : Bunu float içinde yapalým.
		 *
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz:");
		int a=scan.nextInt();
		System.out.println("ikinci sayýyý giriniz:");
		int b=scan.nextInt();
		System.out.println(a+b);
		scan.close();
		
		
		
		
	}

}
