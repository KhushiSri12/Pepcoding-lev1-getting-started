/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-9

ROTATE THE NUMBER "n" BY "k"

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int temp=n;
		int c=0;
		while(temp>0){
		    temp=temp/10;
		    c++;
		    
		    
		    
		}
		k=k%c;
		if(k<0){
		    k=k*c;
		}
		int div=1;
		int mul=1;
		
		for(int i=1;i<=c;i++){
	       if(i<=k){
	           div=div*10;
	       }
	       else{
	           mul=mul*10;
	       }
	}
	int q=n/div;
	int rem=n%div;
    rem=rem*mul+q;
	System.out.println(rem);
	

}
}
