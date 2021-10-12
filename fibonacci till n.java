/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-4

PRINT FIBONACCI NUMBERS TILL N

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=0;
	    int b=1;
	    for(int i=0;i<n;i++){
	        System.out.println(a);
	        int c=a+b;
	        a=b;
	        b=c;
	    }
	    }
	}

