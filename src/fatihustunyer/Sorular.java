package fatihustunyer;

import java.util.Scanner;

public class Sorular {

	public static void main(String[] args) {
		
//1)“Java öğreniyorum” u ekrana 10 defa yaz

System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");
System.out.println("Java ogreniyorum");

	for (int i = 1; i <=10; i++) {
		System.out.println("Java ogreniyorum");
	}

//2)1'den 100'e kadar sayıları ekrana yazdırınız.
	for (int i = 1; i <=100; i++) {
		System.out.print(i+" ");
	}

//3)1'den 100'e kadar olan tüm tek sayıları yazdırınız.
	for (int i = 1; i <=100; i+=2) {
		System.out.print(i+" ");
	}
//4)1'den 5'e kadar olan sayıların karelerini ekrana yazdırınız.
	for (int i = 1; i <=15; i++) {
		System.out.println(i*i);
	}
//5)50 ile 60 dereceleri arasını fahrenheit cinsinden ekrana yazdırınız.
//(fahrenheit=derece*1.8+32)
	for (int i = 51; i < 60 ; i++) {
		System.out.println(i*1.8+32);
		
	}
//6)Kullanıcıdan min ve max değer isteyelim ve aralarındaki sayıları ekrana yazdıralım.

	Scanner scan= new Scanner(System.in);
	System.out.println("Minimum deger giriniz");
	int min=scan.nextInt();//15
	System.out.println("Maksimum deger giriniz");
	int maks=scan.nextInt();//2
	for (int i = min; i <=maks; i++) {
		System.out.print(i+" ");
	}
//7)Kullanıcı min değerini büyük max değerini küçük girerse min ve max değerin yerini değiştirip programımızın normal akışına devam etmesini sağlayın. 
	if(min==maks) {
		System.out.println("maksimum deger buyuk olmalidir");
		maks=scan.nextInt();
	}
	
	int degistir=0;
	if(min>maks) {
		degistir=min;
		min=maks;
		maks=degistir;
	}	
	
	for (int i = min; i <=maks; i++) {
		System.out.print(i+" ");
	}
	
	
	scan.close();
/*
8)Carpim tablosu olusturma
1	2	3	4	5	6	7	8	9	10
2	4	6	8	10	12	14	16	18	20
3	6	9	12	15	18	21	24	27	30
4	8	12	16	20	24	28	32	36	40
5	10	15	20	25	30	35	40	45	50

		 */
	for (int i = 1; i <=10 ; i++) {
		System.out.print(i+"\t");
	}
	System.out.println();		
	for (int i = 1; i <=10 ; i++) {
		System.out.print(2*i+"\t");
	}
	System.out.println();			
	for (int i = 1; i <=10 ; i++) {
		System.out.print(3*i+"\t");
	}
	System.out.println();			
	for (int i = 1; i <=10 ; i++) {
		System.out.print(4*i+"\t");
	}
	System.out.println();			
	for (int i = 1; i <=10 ; i++) {
		System.out.print(5*i+"\t");
	}
	System.out.println();	
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=10 ; j++) {
				System.out.print(i*j+"\t");
			}System.out.println();
		}
		/*sekli olusturunuz.
		 * <-------->
		 * +		+
		 * 	   +
		 * +		+
		 * 	   +
		 * +		+
		 * 	   +
		 * +		+
		 * 	   +
		 * +		+
		 * 	   +
		 * <------- ->*/
		System.out.println("<---------->");
		for (int i = 1; i <=5 ; i++) {
			System.out.println("+\t+");
			System.out.println("    +");
		}
				
		System.out.println("<---------->");
		
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 * 12345678
		 * 123456789
		 * 12345678910
		 */
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

}
