package day03;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		/*
		 * kulln�c�dan boy ve kikosunu
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Boyunuzu cm giriniz:");
		double boy=scan.nextDouble();
		System.out.println("Kilonuzu kg giriniz");
		double kilo=scan.nextDouble();
		
		double BMI = kilo/((boy/100)*(boy/100));
		System.out.println(BMI);
		if(BMI<=20) {
			System.out.println("olduk�a zay�fs�n�z");
		}else if(BMI<=25) {
			System.out.println("normal s�n�rdas�n�z");
			
		}if(BMI<=30) {
			System.out.println("�i�man kategorisindesiniz");
		}else  {
			System.out.println("obez grubundas��nz");
			
		scan.close();
		
		
		
		}
		
		
	}

}
