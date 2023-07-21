import java.util.*;
public class Hack{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=1;i<=q;i++){
		    System.out.println("Enter a , b and l");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int l=sc.nextInt();
		  int sum=a+b;
		 int p=1;
		for(int j=1;j<=l;j++){
			System.out.println(sum);
			p=p*2;
			sum=sum+p*b;
			
			
		}	
			}
		}
	}	
			