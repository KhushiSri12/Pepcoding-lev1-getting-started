/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-10

GCD AND LCM OF TWO NUMBERS
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int n1=sc.nextInt();

	    for(int i=Math.min(n,n1);i>1;i--){
	        if(n%i==0 && n1%i==0){
	            int hcf=i;
	            int lcm=(n*n1)/hcf;
	            System.out.println(hcf);
	            System.out.println(lcm);
	            break;
	           
	        }

	    }
	     
   }
}


