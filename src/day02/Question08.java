package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 *  Kullan�c�ndan 2 say� alal�m ve bunlar�n birbirleriyle olan 
		 *  durumunu kar��la�t�rak�m.
		 * num1 > num2
		 * num1 < num2
		 * num1==num2
		 * num1 != num2
		 *  num1 <= num2
		 *  num1 >= num2
		 *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki say� giriniz");
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
