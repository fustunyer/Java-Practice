package day06;

public class EnBuyukSayi {

	public static void main(String[] args) {
	//Uc sayi arasindaki en buyuk sayiyi bulan java metodunu yaziniz

		enBuyuk(12,45,36);
		enBuyuk(-2,-15,-6);
		
		
	}
	public static void enBuyuk(double a,double b,double c) {
		
		if(a>b&&a>c) {
			System.out.println("En buyuk sayi: "+a);
		}else if(b>a&&b>c) {
			System.out.println("En buyuk sayi: "+b);
		}else {
			System.out.println("En buyuk sayi: "+c);
		}
				
		
	}
	
	
}
