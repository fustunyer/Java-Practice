package day02;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan 2 tam say� alal�m ve d�rt i�lem sonucunu yazd�ral�m.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki say� giriniz");
		double s1=scan.nextDouble();
		double s2=scan.nextDouble();
		
		System.out.println("toplam: "+ (s1+s2));
		System.out.println("fark: "+ (s1-s2));
		System.out.println("�arp�m: "+ (s1*s2));
		System.out.println("b�l�m: "+ (s1/s2));
		
		scan.close();
			
	}

}
