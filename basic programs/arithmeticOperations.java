import java.util.Scanner;
public class arithmeticOperations{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter first number");
        int x=s.nextInt();
        System.out.println("enter 2nd number");
        int y= s.nextInt();

        System.out.println("enter choice: \n 1.Addition\n 2. Subtraction \n 3. Multiplication \n 4.Division \n 5.Remainder" );
        int choice=s.nextInt();

        switch(choice){
            case 1:
                System.out.println("sum of given two numbers is "+ (x+y));
                break;

            case 2:
                System.out.println("difference="+(x-y));
                break;

            case 3:
                System.out.println("product="+(x*y));
                break;
            
            case 4:
                if(y!=0){
                System.out.println("quotient="+(x/y));}
                else{
                    System.out.println("denominator cant be 0");
                }
                break;

            case 5:
                System.out.println("remainder="+(x%y));
                break;
            
            default:
                System.out.println("invalid option");
                

        }
    }
}