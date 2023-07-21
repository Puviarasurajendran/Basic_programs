import java.util.*;
public class Missing{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,5,7,4,9};
		int count=arr[0];
		if(arr[0]!=1){
			System.out.print("missing : 1");
		}
		else{
		for(int i=1;i<arr.length;i++){
				if(arr[i]-arr[i-1]!=1){
			       count=arr[i-1];
				   break;
				   }
				continue;
				   
			
		}
		
		
			System.out.print("missing :"+(count+1));
		}
		}
		}
				   