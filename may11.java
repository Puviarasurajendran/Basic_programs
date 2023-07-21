import java.util.*;
public class may11{
   public int maxi(int ...x)//variable Arguments
   {
        if(x.length==0) return Integer.MIN_VALUE;
		int max=x[0];
	        for(int i=1;i< x.length;i++){
			   if(x[i]>max) max=x[i];
			   }
		return max;
        }
    public static void main(String args[]){
		may11 m11=new may11();
        System.out.println(m11.maxi(2,7,9,10,55,3,4));
        System.out.println(m11.maxi(3));
        System.out.println(m11.maxi());

        }
    }		