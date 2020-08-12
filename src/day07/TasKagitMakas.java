package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfMyWin=0;
		int numberOfComWin=0;
		int gameOver=3;
		
		List<String> elemanlar=new ArrayList<>();
		elemanlar.add("Tas");
		elemanlar.add("Makas");
		elemanlar.add("Kagit");
		Scanner scan = new Scanner(System.in);
		
		while(numberOfMyWin<gameOver&&numberOfComWin<gameOver) {
			System.out.println("Tas secmmek icin 0\nMakas secmek icin 1\nKagit secmek icin 2\nseciniz");
			int myGuess=scan.nextInt();
			int comGuess=new Random().nextInt(3);
			System.out.println(myGuess+"\n"+comGuess);
			
			if(myGuess==comGuess) {
				System.out.println("Berabere");
			}else if ((myGuess==0 && comGuess==1)||(myGuess==1 && comGuess==2)||(myGuess==2 && comGuess==0)) {
				System.out.println("Kazandiniz");
				numberOfMyWin++;
			}else {
				System.out.println("Bilgisayar Kazandi");
				numberOfComWin++;
			}
			if(numberOfMyWin==3) {
				System.out.println("==GAME OVER==");
				System.out.println("Sizin kazandiniz: " + numberOfMyWin);
				System.out.println("Kabettiniz: " +numberOfComWin);
				}else if(numberOfComWin==3){
				System.out.println("==GAME OVER==");
				System.out.println("Biligisayar kazandi: " + numberOfComWin);
				System.out.println("Kabettiniz: " +numberOfMyWin);
				}
			scan.close();
		
		}
		
	}

}
