package day01;

import java.util.Scanner;

public class Practice02 {
	
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("isim giriniz:");
		String isim = scan.next();
		System.out.println("isim: "+isim);
		String soyisim = scan.next();
		System.out.println("soyisim:"+ soyisim);
		
		System.out.println("isim ve soyisim giriniz");
		
		System.out.println();
		/*
		
		boolean booleanDegiskeni= scan.nextBoolean();
		byte b= scan.nextByte();
		int intDegiskeni= scan.nextInt();
		char c1= scan.next().charAt(0);
		short s1 = scan.nextShort();
		long l1= scan.nextLong();
		float f1=scan.nextFloat();
		double d1 =scan.nextDouble();
		String s2=scan.nextLine();
		System.out.println(b+intDegiskeni+c1+s1+l1+f1+d1+s2);
		
		*/
		scan.close();
			
		

	}

}
