import java.util.*;
public class May8{
   public static void main(String args[]){
	   
	    
            isPrime(5,25); 
		
   }
   
   public static void isPrime(int start,int end){
	   for(int n=start;n<=end;n++){
	    if(n==1 || n==2 || n==3){
            System.out.println(n+" isPrime");
		}
         else{		
            for(int i=2;i<=n/2;i++){
			    if(n%i==0){
				   System.out.println(n+" is not a Prime");
				   break;
				}
			System.out.println(n+" isPrime");
			   break;
			}
			
		}
			
 }
   }
}
	

