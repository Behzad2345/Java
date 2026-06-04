//return true if 2 or more digits have rightmost digit same, integers are non negative
import java.util.Scanner;
public class RightmostDigit{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter first number");
        int x=s.nextInt();
        System.out.println("enter 2nd number");
        int y= s.nextInt();
        System.out.println("enter 3nd number");
        int z= s.nextInt();

        int d1=x%10;
        int d2=y%10;
        int d3=z%10;

        if(d1==d2 || d2==d3 ||d1==d3){
            System.out.println(true);
        }
        else{
            
            System.out.println(false);
        }



    }
}