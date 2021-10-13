/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-6

DIGITS OF THE NUMBER

SOLUTION-1
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    while(n!=0){
	        System.out.println(n%10);
	        n=n/10;
	    }
}
}



/*SOLUTION-2*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int nod=0;
	    int temp=n;
	    while(temp!=0){
	        temp=temp/10;
	        nod++;
	    }
	    int div=(int)(Math.pow(10,nod-1));
	    while(div!=0){
	        int q=n/div;
	        System.out.println(q);
	        n=n%div;
	        div=div/10;
	        
	    }
	    
	}
    
}
