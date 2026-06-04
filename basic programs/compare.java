//compare two numbers
import java.util.Scanner;
public class compare{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter first number a:");
        int a=s.nextInt();
        System.out.println("enter 2nd number b");
        int b= s.nextInt();

        if(a>b){
             System.out.println(a+" is greater than "+b);

        }
        else if(a<b){
            System.out.println(a+" is less than "+b);

        }
        else{
            System.out.println(a+" is equal to "+b);
        }

    }
}