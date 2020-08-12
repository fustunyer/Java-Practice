package day03;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
/*kullanýcýdan 3 pozitif tamsayý alalým.
* bu üç sayýdan üçgen olup olmamayý inceleyelim
* eðer 
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("üç kenarýný girin:");
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
