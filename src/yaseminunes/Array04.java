package yaseminunes;

public class Array04 {

	public static void main(String[] args) {
		//Bir arrayde kac tane x var.
		int arr[] = {3,2,7,3,3,6};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
