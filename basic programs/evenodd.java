import java.util.Scanner;

class evenodd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number u want to check");
        int num=s.nextInt();
        if(num%2==0){
            System.out.println(num +" is even");
    
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}