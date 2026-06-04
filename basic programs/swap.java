//sweap with or withour 3rd variable
import java.util.Scanner;
public class swap{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter first number a:");
        int a=s.nextInt();
        System.out.println("enter 2nd number b");
        int b= s.nextInt();
         //using 3rd variable
         int temp=a;
         a=b;
         b=temp;

         System.out.println("after swapping using 3rd variable, a="+a+"   b="+b);

         //without 3rd var
         a=a+b;
         b=a-b;
         a=a-b;
           //will print old values as swapped again
          System.out.println("after swapping without using 3rd variable(prints original values as swapped again), a="+a+"   b="+b);


        
        
        
        
        }}