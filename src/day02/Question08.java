package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 *  Kullanýcýndan 2 sayý alalým ve bunlarýn birbirleriyle olan 
		 *  durumunu karþýlaþtýrakým.
		 * num1 > num2
		 * num1 < num2
		 * num1==num2
		 * num1 != num2
		 *  num1 <= num2
		 *  num1 >= num2
		 *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayý giriniz");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		
		if (s1==s2) {
			System.out.println(s1+"="+s2);
			}if (s1!=s2) {
			System.out.println(s1+"!="+s2);
			}if (s1<s2) {
				System.out.println(s1+"<"+s2);
			}if (s1<=s2) {
				System.out.println(s1+"<="+s2);
			}if (s1>s2) {
				System.out.println(s1+">"+s2);
			}if (s1>=s2) {
				System.out.println(s1+">="+s2);
			}				
		
		scan.close();
		

	}

}
