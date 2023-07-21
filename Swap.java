import java.util.Scanner;
   public class Swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;//a=a^b;
		b=a-b;//b=a^b;
		a=a-b;//a=a^b;
	System.out.println("value oF A is :"+a +'\n'+"value oF B is :"+b);
		}
		}