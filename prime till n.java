/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-3

PRINT PRIME TILL N

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int low=sc.nextInt();
	    int high=sc.nextInt();
	    
	    for(int i=low;i<=high;i++){
	       int c=0;
           for(int j=2;j*j<=i;j++){
               if(i%j==0){
                   c=1;
                   break;
               }
           }
           if(c==0){
               System.out.println(i);
	    }
  
           }

	    
	 
	}
}
