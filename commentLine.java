import java.util.*;
public class commentLine{
 public static void main(String args[]){
	      // double s=0;
        //for(String x:args){
		//s=s+Double.parseDouble(x);
			
		       
		 int result=fact(5);
		 System.out.println(result);
		}
		//System.out.println(s);
 
 public static int fact(int n){
	 if(n>1)
		return n*fact(n-1);
	 return 0;
	 } 
	 
}
