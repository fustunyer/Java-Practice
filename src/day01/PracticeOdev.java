package day01;

import java.util.Scanner;

public class PracticeOdev {

	public static void main(String[] args) {
		/* Kullan�c�dan 2 tane say� alal�m ve �arpma ve b�lme i�lemi yapt�r�p ekrana yazd�ral�m
		 * 
		 * 1. Ad�m : Scanner class'�ndan nesne �retelim.
		 * 2. Ad�m : Kullan�c�dan 2 tane say� isteyelim.
		 * 3. Ad�m : Ald���m�z say�lar� birbiriyle �arpal�m ve b�lelim.
		 * 4. Ad�m : Bunu ekrana yazd�ral�m.
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
