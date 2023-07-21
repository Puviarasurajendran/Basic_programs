import java.util.*;
public class Switchprblm{
    public static void main(String args[]){
	    String url="www.google.in";
		String ext=url.substring(url.lastIndexOf("."));
		switch(ext){
		    case "org":
		           System.out.println("It's Organisation");
		           break;
		    case "com":
		           System.out.println("It's commercial");
		           break;
		    case "net":
		           System.out.println("It's Network");
		           break;
		    default:
		       System.out.println("Invalid URL");
			   
		}
	}
}
		

