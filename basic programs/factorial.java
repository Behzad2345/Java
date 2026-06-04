import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter a number");
        int x=s.nextInt();
            
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;

        }
        System.out.println("factorial of "+x+" is ="+fact);
    }
}