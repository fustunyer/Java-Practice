package day03;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		/*kullan�c�dan 4 i�lemden birini se�mesini isteyece�iz
		 * 2 say� girsin.
		 * sonucu yazd�r.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir i�lem giriniz");
		String islem=scan.nextLine();
		System.out.println("iki say� giriniz:");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if(islem.toUpperCase().equals("TOPLAMA")) {
			System.out.println("TOPLAMA SONUCU= "+(num1+num2));
		}else if(islem.toUpperCase().equals("�ARPMA")) {
			System.out.println("�ARPMA SONUCU= "+num1*num2);
		}if(islem.toUpperCase().equals("�IKARMA")) {
			System.out.println("�IKARMA SONUCU= " + (num1-num2));
		}else if(islem.toUpperCase().equals("B�LME")) {
			System.out.println("B�LME SONUCU= "+num1/num2);
		}else {
			System.out.println("L�TFEN B�R ��LEM G�R�N�Z...");
		}scan.close();
		
		// Kullan�c�da 4 islemden birisini se�tirelim
				// toplama,cikartma, carpma,bolme
				// 2 say� girsin.
				//sonucu yazd�ral�m.
				// toplama 5, 6  "Toplama isleminin sonucu: 5+6 = 11"
				// Toplama 
				/*
				Scanner input = new Scanner(System.in);
				System.out.println("Lutfen isleminizi seciniz. \ntolpama\ncikartma\ncarpma\nbolme");
				String islem1 = input.next();
				System.out.println("Lutfen iki sayi giriniz");
				double num1 =input.nextDouble();
				double num2= input.nextDouble();
				
				if(islem.equalsIgnoreCase("toplama")) {
					System.out.println("Toplama isleminin sonucu: " + num1+"+"+num2+"="+(num1+num2));
				}else if (islem.equalsIgnoreCase("cikartma")) {
					System.out.println("Cikartma isleminin sonucu: " + num1+"-"+num2+"="+(num1-num2));
					
				}else if (islem.equalsIgnoreCase("carpma")) {
					System.out.println("Carpma isleminin sonucu: " + num1+"x"+num2+"="+(num1*num2));
				}else if (islem.equalsIgnoreCase("bolme")) {
					System.out.println("Bolme isleminin sonucu: " + num1+"/"+num2+"="+(num1/num2));
				}else {
					System.out.println("Hatali secim");
				}
				*/
				

		
		
		
		
		
	}

}
