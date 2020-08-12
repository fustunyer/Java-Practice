package day04;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		//kullanicaidan alinan bir sayinin carpim tablosunun yazdirin
		
		Scanner input=new Scanner(System.in);
		System.out.println("Bir rakam giriniz");
		int rakam=input.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(rakam+"x"+i+"="+rakam*i);
		}
		
		for(int i=1;i<=10;i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}System.out.println("********");
		}

		input.close();
	}

}
