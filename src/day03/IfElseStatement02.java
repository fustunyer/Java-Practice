package day03;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
/*kullan�c�dan 3 pozitif tamsay� alal�m.
* bu �� say�dan ��gen olup olmamay� inceleyelim
* e�er 
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("�� kenar�n� girin:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		boolean u= a>=b+c || b>=a+c|| c>=a+b||a<=b-c||b<=a-c||c<=a-b;
				
		if(u) {
			System.out.println("Bu ucgen cizilemez");
		}else if(a==b && a==c) {
			System.out.println("Eskenar ucgen");
		}else {
			System.out.println("Cesitkenar ucgen");
		}scan.close();
	}



	}
