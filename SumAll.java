import java.util.*;
public class SumAll{
   public static void main(String args[]){
      int n,sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number and negative number stop the sum");
   while(true){
     n=sc.nextInt();
	 if(n<0){
	   break;
    	 }
		 sum +=n;
		 }
	System.out.println("total value is : "+sum);	 
	}
}	