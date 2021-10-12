/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-2

PRINT PRIME OR NOT PRIME

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int x=0;x<t;x++){
	        int c=0;
	        int n=sc.nextInt();
	        if(n==1){
	            c=0;
	        }
	        for(int i=2;i*i<=n;i++){
	            if(n%i==0){
	                c=1;
	                break;
	            }
	        }
	        if(c==0){
	            System.out.println("prime");
	        }
	        else{
	            System.out.print("not prime");
	        }
	    }
	    
	 
	}
}
