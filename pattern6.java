import java.util.*;
class pattern6{
    public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 for(int i=0;i<2*n-1;i++){
		  int k=i;
		  if(k>=n) k=2*n-i-2;
	    for(int j=1;j<=2*n-1;j++){
		    
			if(j<n-k||j>n+k){
			    System.out.print(" ");  
			}
		    else 
		        System.out.print("*");
		}
		
	    System.out.println(" ");
	 }
	
    }
  }
