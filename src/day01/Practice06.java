package day01;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// 
		/* Kullan�c�dan 2 tane say� alal�m ve toplama i�lemi yapt�r�p ekrana yazd�ral�m
		 * 
		 * 1. Ad�m : Scanner class'�ndan nesne �retelim.
		 * 2. Ad�m : Kullan�c�dan 2 tane say� isteyelim.
		 * 3. Ad�m : Ald���m�z say�lar� toplayarak, yeni bir de�i�kene atayal�m.
		 * 4. Ad�m : Bunu ekrana yazd�ral�m.
		 * 5. Ad�m : Bunu float i�inde yapal�m.
		 *
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz:");
		int a=scan.nextInt();
		System.out.println("ikinci say�y� giriniz:");
		int b=scan.nextInt();
		System.out.println(a+b);
		scan.close();
		
		
		
		
	}

}
