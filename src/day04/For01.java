package day04;

public class For01 {

	public static void main(String[] args) {
	//1 den 100 e kadar sayilardan 3e 5e ve 15e bolunenleri yazdirin
	//3 e bolunenler 3,6,9,12,..
	//5 e bolunenler 5,10,15,...
	// 15 e bolunenler 51,30,45,...
	
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
			}
		System.out.println(" ");
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		for (int j = 0; j <= 100; j++) {
			if(j%15==0) {
				System.out.print(j+" ");
		}
		
		
		
		}
	}
}

