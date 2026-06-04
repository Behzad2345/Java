/*
check if a 2-digit number is special
a number is special if:
sum of digits+product of digits=original number
 */

import java.util.Scanner;

public class specialNumber{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int num= s.nextInt();
        int original=num;
        int sum=0,product=1;
       while(num>0){
        int digit=num%10;
        sum+=digit;
        product*=digit;

        num=num/10;

       }

       if(sum+product==original){
        System.out.println("number is special");
       }
       else{
        System.out.println("number is NOT special");
       }

    }
}