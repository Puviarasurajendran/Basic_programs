import java.util.*;
public class DuplicateFind{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();
		int n=url.length();
		int j=0;
		int s=0;
		char[] str=new char[n];
		str[s]=url.charAt(j);
		for(int i=0;i<n;i++){
			if(str[s]!=url.charAt(i)){
				str[++s]=url.charAt(i);
			}
			else{
				continue;
	}
		}
	    int arr[]=new int[n];
		int k=0;
		int count=0;
	    for(int i=0;i<n;i++){
			if(str[k]==url.charAt(i)){
				count+=1;
				arr[k]=count;
			}
			else{
				k++;
				i--;
				count=0;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
			System.out.println(str[i]+""+arr[i]);
		}
		}
			
	
}
}