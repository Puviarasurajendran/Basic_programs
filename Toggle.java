import java.util.*;
//import java.lang.*;
class Toggle{
       public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
			System.out.println("enter a input: ");
			String str=sc.next();
			String result="";
			for(int i=0;i<str.length();i++){
			    if(Character.isUpperCase(str.charAt(i))){
				    result+=Character.toLowerCase(str.charAt(i));    
			       }
				else{
                     result+=Character.toUpperCase(str.charAt(i));		
                    }
            }
			System.out.println(result);
        }
    }		