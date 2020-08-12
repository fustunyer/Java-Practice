package day03;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan 2 sayý alalým
		 * kullanýcýdan 4 iþlemden birini seçsin
		 * sonucu yazdýralým
		 */
		Scanner input = new Scanner (System.in);
		System.out.println("iki sayý giriniz");
		double s1=input.nextDouble();
		double s2=input.nextDouble();
		System.out.println("Lutfen iþlemin numarasýný giriniz \n1.toplama\n2.çýkarma\n3.çarpma\n4.bölme");
		int jobTitle=input.nextInt();
		
			
		
		
		
		switch(jobTitle) {
		case 1:
			System.out.println("toplamý= "+(s1+s2));
			break;
		case 2:
			System.out.println("farký="+(s1-s2));
			break;
		case 3:
			System.out.println("çarpýmý= "+(s1*s2));
			break;
		case 4:
			System.out.println("bölümü="+(s1/s2));
			break;
		default:
			System.out.println("iþlemi doðru giriniz");
		}
		
		input.close();
		
		
		
		
		
		

	}

}
