import java.util.*;
public class DigitIsOddOrEven{
    public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
		digitIsOddOrEven(n);
	
	}
	public static void digitIsOddOrEven(int n){
	     int count=1;
		 int flag=1;
	    while(n!=0){
		 int rem=n%10;
		 if(rem%2==0){
		    count++;
		 }
		 else {
		    flag++;
		 }
		 n/=10;    
		}
		if(count>2) System.out.println("Given digits are even: ");
		else if(flag>2) System.out.println("Given digits are odd: ");
	    else System.out.println("Given digits are mixed with both: ");
	}
   
}