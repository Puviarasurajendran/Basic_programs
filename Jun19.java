import java.lang.*;
public class Jun19{
    public static void main(String args[]){
	        int arr[]={2,3,4,2,3,1,6,8,7,4};
	        sockMerchant(arr);
			}
	public static void sockMerchant(int arr[]){
	        int arr1[]=new int[arr.length];
			int count=1;
			arr1[0]=arr[0];
			for(int i=2;i<arr.length;i++)
			if(arr[i-1]!=arr[i]){
			    arr1[count++]=arr[i-1];
				}
		  for(int x:arr1){
			  System.out.print(x+" ");
			  
		  }
			}
}		
                	