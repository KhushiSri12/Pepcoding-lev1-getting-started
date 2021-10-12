/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-5

COUNT DIGITS


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=0;
	    while(n!=0){
	        n=n/10;
	        c+=1;
	        
	    }
	    System.out.println(c);

	    }
	
}
	

