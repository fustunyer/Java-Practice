package day03;

import java.util.Scanner;

public class SayilariKarsilastirma {

	public static void main(String[] args) {
		/*
		 *  Büyüktür >
			Küçüktür <
			Büyük yada eşit =>
			Küçük yada eşit =<
			Eşittir ==
			Eşit değildir !=
		 */
		 Scanner input = new Scanner(System.in);
	        int number1 = input.nextInt();
	        int number2 = input.nextInt();
	        
	        if (number1<number2) {
	        	System.out.println(number1+"<"+number2);
	        } if (number1<=number2) {
	        	System.out.println(number1+"<="+number2);
	        } if (number1>number2) {
	        	System.out.println(number1+">"+number2);
	        } if (number1>=number2) {
	        	System.out.println(number1+">="+number2);
	        } if (number1!=number2) {
	        	System.out.println(number1+"!="+number2);
	        } if (number1==number2) {
	        	System.out.println(number1+"=="+number2);
	        }
		
		input.close();
		
		
		
	}

}
