package day02;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan 2 tam sayý alalým ve dört iþlem sonucunu yazdýralým.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayý giriniz");
		double s1=scan.nextDouble();
		double s2=scan.nextDouble();
		
		System.out.println("toplam: "+ (s1+s2));
		System.out.println("fark: "+ (s1-s2));
		System.out.println("çarpým: "+ (s1*s2));
		System.out.println("bölüm: "+ (s1/s2));
		
		scan.close();
			
	}

}
