package assignment;
import java.util.Scanner;


public class permutation {
	static void permute(String str,String res) {
		if(str.length()==0) {
         System.out.println(res);
         return;
         }
	for(int i=0;i<str.length();i++) {
		char ch= str.charAt(i);
		String left=str.substring(0,i);
		String right=str.substring(i+1);
		String total= left+right;
	      permute(total,res+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		permute(str,"");
		
		

	}

}
