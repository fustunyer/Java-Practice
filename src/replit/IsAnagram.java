package replit;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent"));
		
		
	}
		public static boolean isAnagram(String word1, String word2) {
			  word1=word1.toLowerCase();
			  word2=word2.toLowerCase();
			  String [] arr1 = word1.split("");
			  String [] arr2 = word2.split("");
			  System.out.println(Arrays.toString(arr1));
			  System.out.println(Arrays.toString(arr2));
			  int count=0;
			  for (String w : arr1) {
				for (String z : arr2) {
					if(w.equals(z)) {
						count++;
					}
				}
			}
			  if(count==arr1.length){
				  return true;
			  }else {
				  return false;
			  }
	}

}
