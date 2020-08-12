package fatihustunyer;

public class CarpimTablosu {

	public static void main(String[] args) {
		/*
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


		
		
	}

}
