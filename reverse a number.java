/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-7

REVERSE THE NUMBER

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



