package day03;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan 2 say� alal�m
		 * kullan�c�dan 4 i�lemden birini se�sin
		 * sonucu yazd�ral�m
		 */
		Scanner input = new Scanner (System.in);
		System.out.println("iki say� giriniz");
		double s1=input.nextDouble();
		double s2=input.nextDouble();
		System.out.println("Lutfen i�lemin numaras�n� giriniz \n1.toplama\n2.��karma\n3.�arpma\n4.b�lme");
		int jobTitle=input.nextInt();
		
			
		
		
		
		switch(jobTitle) {
		case 1:
			System.out.println("toplam�= "+(s1+s2));
			break;
		case 2:
			System.out.println("fark�="+(s1-s2));
			break;
		case 3:
			System.out.println("�arp�m�= "+(s1*s2));
			break;
		case 4:
			System.out.println("b�l�m�="+(s1/s2));
			break;
		default:
			System.out.println("i�lemi do�ru giriniz");
		}
		
		input.close();
		
		
		
		
		
		

	}

}
