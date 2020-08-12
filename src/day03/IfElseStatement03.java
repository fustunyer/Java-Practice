package day03;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		/*
		 * kullnýcýdan boy ve kikosunu
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Boyunuzu cm giriniz:");
		double boy=scan.nextDouble();
		System.out.println("Kilonuzu kg giriniz");
		double kilo=scan.nextDouble();
		
		double BMI = kilo/((boy/100)*(boy/100));
		System.out.println(BMI);
		if(BMI<=20) {
			System.out.println("oldukça zayýfsýnýz");
		}else if(BMI<=25) {
			System.out.println("normal sýnýrdasýnýz");
			
		}if(BMI<=30) {
			System.out.println("þiþman kategorisindesiniz");
		}else  {
			System.out.println("obez grubundasýýnz");
			
		scan.close();
		
		
		
		}
		
		
	}

}
