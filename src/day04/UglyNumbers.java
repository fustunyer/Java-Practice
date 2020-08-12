package day04;

import java.util.Scanner;

public class UglyNumbers {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int num= sc.nextInt();
		    sc.close();
			  
		    while(num!=1){ 
		      if(num%2==0){
		        num/=2;
		      }else if(num%3==0){
		        num/=3;
		      }else if(num%5==0){
		        num/=5;
		      }else 
		      {System.out.println("ugly number degil");
		      return;
		      }
		    } System.out.println("ugly number");

		    
	}

}
