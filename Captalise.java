import java.util.*;
class Captalise{
       public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
			System.out.println("enter a input: ");
			String str=sc.nextLine();
			int len=str.length();
			String firstChar=str.substring(0,1);
			String lastChar=str.substring(len-1);
			String remChar=str.substring(1,len-1);
			str=firstChar.toUpperCase()+remChar+lastChar.toUpperCase();
			System.out.println(str);
		}
    }		