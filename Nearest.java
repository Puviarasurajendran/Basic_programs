import java.util.*;
public class Nearest{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of n : ");
   int n=sc.nextInt();
   while(true){
      if(n%10==0){
	  System.out.println("value is n : "+n);
	  break;
	  }
	  --n;
	  }
	}
}