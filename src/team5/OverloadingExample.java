package team5;

public class OverloadingExample {
	
	public static void main(String[] args) {
		
		//OverloadingExample obj=new OverloadingExample();
		selam();//
		
		
	}
	public static void selam(int w) {
		System.out.println("merhaba 1");
	}
	public static void selam() {
		System.out.println("merhaba 2");//parametrelerin cinsi, sayisi ve yeri degistirilerek overloading yapilabilir.
	}
	public void selam(String str) {
		System.out.println("merhaba "+str);//access modifier ve return type ve method body degistirilerek Overloading yapilmaz.
	}
	public void selam(String str1,String str2) {
		
	}
    public void selam(int sayi ,String str2) {
		
	}
    public void selam(String str2,int sayi ) {
		
	}
	
	
	
	

}
