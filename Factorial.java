import java.util.*;
public class Factorial{
    public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number:");
	   int sum=1;
	   int n=sc.nextInt();
	   while(n>0){
		   sum=sum*n;
		   n--;
	   }
	   System.out.println("Factorial of "+n +"is " +sum);
	}
}