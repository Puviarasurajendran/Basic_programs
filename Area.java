import java.util.*;
import java.lang.*;
public class Area{
    public static void main(String args[]){
	    float val=triAngle();
		System.out.println("Area of triangle is " + val);
	
	}
	static float triAngle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float s=(a+b+c)/2;
		float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
		}
		}
	