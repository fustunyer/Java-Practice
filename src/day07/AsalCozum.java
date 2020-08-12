package day07;

public class AsalCozum {

	public static void main(String[] args) {
		//Asal sayi bulan bir method yaziniz
		
		asalSayi(15648);
		

	}
	public static int asalSayi(int num) {
		int count=0;
		for (int i = 1; i <=num ; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num +" Asal sayidir");
		}else {
			System.out.println(num+" Asal sayi degildir.");
			
		}
		return num;
	}
	

}
