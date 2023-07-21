import java.util.*;
public class Odd{
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=2){
		   System.out.println(i);
		}
    }
}		   