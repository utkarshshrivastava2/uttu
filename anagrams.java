package assignment;
import java.util.Arrays;
import java.util.Scanner;


public class anagrams {

	static void isAnagram(String str1,String str2)
	 {  
		boolean value=false;
		if(str1.length()!=str2.length()){
			value=false;
			}
		else {
			char[] Array1=str1.toCharArray();
			char[] Array2=str2.toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			value= Arrays.equals(Array1,Array2);
			}
			
		if(value){
			System.out.println("yes it is anagram");
			}
		else {
		System.out.println("no it is not an anagram");
		}	

  }

		public static void main(String[] args){
			Scanner s= new Scanner(System.in);
			String str1= s.nextLine();
			String str2= s.nextLine();
			isAnagram(str1,str2);
			
		}

	}
	
