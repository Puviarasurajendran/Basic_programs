import java.util.*;
public class Pyramid{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
	   System.out.print("enter input: ");
	   int n=sc.nextInt();
	   int k=1;
	   for(int i=1;i<=n;i++){
	    for(int j=1;j<=n;j++){
		    if(j<(n+1-i)){
               System.out.print(" ");
					}
				else{
				    System.out.print(k+" ");
                        k++	;				
					}
            }
            System.out.println();
        }
    }
}	