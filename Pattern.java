import java.util.*;
public class Pattern{
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		System.out.print("enter n :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int k=i;
			for(int j=1;j<=(n+1)-i;j++){
				System.out.print(k+" ");
				 k=k+((n+1)-j);
				
			}		 
		  System.out.println(" ");
		}
		  }
		}   