package assignment;
import java.util.*;
public class prime {
static void isprime(int n) {

	boolean f;
	if(n==0||n==1)
		System.out.println("please enter number other than 0 and 1");
	for(int i=1;i<=n;i++)
	{     f=true;
		for(int j=2;j<=i/2;j++)
			if(i%j==0)
			{
				f=false;
				break;
				 
			}
			
			if(f)
				System.out.println(i);
	}	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		isprime(n);
				
			}
		
		
	}
