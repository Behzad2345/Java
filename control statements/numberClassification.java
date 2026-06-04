/* 
write a java program that classifies a number AS
1. POSITIVE/negative/zero
2. even/odd
3. multiple of 5 or not
4. three digit or not

display all classifications

 */

import java.util.Scanner;

public class numberClassification{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int num= s.nextInt();

        System.out.println(num+" is:");

        if(num>0){
            System.out.println("1. positive");
        }
        else if(num<0){
            System.out.println("1. negative");

        }
        else{

            System.out.println("1. zero");
        }
        


    if(num%2==0){
        System.out.println("2. even");
    }
    else{
        System.out.println("2. odd");
    }


    if(num%5==0){
        System.out.println("3. multiple of 5");
    }
    else{
        System.out.println("3. not a multiple of 5");
    }


    if(Math.abs(num)>=100 && Math.abs(num)<=999){ //In Java, Math.abs(x) returns the non‑negative value of x, regardless of whether x is positive or negative.
        System.out.println("4. a 3 digit number");
    }
    else{
        System.out.println("4. not a 3 digit number");
    }
    }
      }