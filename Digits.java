import java.util.*;
public class Digits{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		while(n>0){
		    int r=n%10;
			n=n/10;
			str+=r;
			}
			System.out.println(str);
			char c;
		for(int i=str.length()-1;i>=0;i--){
		       c=str.charAt(i);
			switch(c){
			    case '0':System.out.print("zero ");
                         break;
				case '1':System.out.print("one ");
                         break;
				case '2':System.out.print("two ");
                         break;
				case '3':System.out.print("three ");
                         break;
				case '4':System.out.print("four ");
                         break;
				case '5':System.out.print("five ");
                         break;
				case '6':System.out.print("Six ");
                         break;
				case '7':System.out.print("Seven ");
                         break;
				case '8':System.out.print("Eight ");
                         break;
				case '9':System.out.print("nine ");
                         break;
			    default: System.out.print("Invalid ");
                         break;				
				
			}
        }			
	}
}	