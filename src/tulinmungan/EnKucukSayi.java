package tulinmungan;

import java.util.Scanner;

public class EnKucukSayi {

	public static void main(String[] args) {
		// Create a method to find the smallest of three numbers.
		// Kullanicidan alinan 3 sayinin en kucugunu ekrana yazdıran program.
		Scanner sc=new Scanner(System.in);
		System.out.println("uc sayi giriniz");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		
		System.out.println(enKucuk(num1,num2,num3));
	
		
		
		sc.close();
		

	}
	public static int enKucuk(int num1 , int num2, int num3) {
		if(num1==num2 && num2==num3) {
			return num1;
		}else if(num1<num2 && num1<num3) {
			return num2;
		}else {
			return num3;
		}
			
		
		
		
	}
	
	
	
	

}
