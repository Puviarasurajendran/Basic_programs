import java.util.*;
public class DiamondPattern{
    public static void main(String args[]){
	    Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
	}
	public static void pattern(int n){
		       int num=(2*n)-1;
			   int startSpace=0;
				int startnum=0;
	    for(int i=1;i<=(2*n)-1;i++){
                char k='A';
				if(i>n){
					startSpace=i-n;
					num-=2;
					startnum=num;
				}
				else{
					startSpace=n-i;
				    startnum=(2*i)-1;
				}
				
		    for(int j=1;j<=startSpace;j++){
			    System.out.print(" ");
		    }
			for(int j=1;j<=startnum;j++){
			    System.out.print(k);
				if(i<=n){
				    if(i<=j) k--;
				    else k++;
				}
				else{
					if(j >=(2*n)-i) k--;
					else k++;
				}					
				
				
			}
			System.out.println(" ");	
	    }  		
	} 
}