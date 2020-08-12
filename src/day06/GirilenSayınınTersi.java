package day06;

public class GirilenSayınınTersi {

	public static void main(String[] args) {
		//Girilen sayının tersini return eden java methodunu yazınız.
		

		System.out.println("Sayinin tersi: "+ sayininTersi(154698549));
		

	}
	
	public static int sayininTersi(int n) {
		int sonuc=0;
		while(n>0) {
			int temp=n%10;
			n/=10;
			sonuc=sonuc*10+temp;
			 
		}
		return sonuc;
		
		
	}
	

}
