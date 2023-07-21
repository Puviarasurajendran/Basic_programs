import java.util.Scanner;
public class vowels{
    public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("enter alphabet");
	char alp=in.next().charAt(0);
	switch(alp){
	case 'a':
	   System.out.println("Vowel");
	   break;
	case 'e':
	   System.out.println("Vowel");
	   break;
    case 'i':
	   System.out.println("Vowel");
	   break;
    case 'o':
	   System.out.println("Vowel");
	   break;
	case 'u':
	   System.out.println("Vowel");
	   break;
	default:
	   System.out.println("Consonance");
	   }
	}
}	