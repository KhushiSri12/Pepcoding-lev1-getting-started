/*
PEPCODING LEVEL-1 GETTING STARTED

QUESTION-1
PRINT "Z"

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0||i==4){
                    System.out.print("*");
                }
                else if (i+j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}