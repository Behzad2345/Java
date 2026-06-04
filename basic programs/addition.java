import java.util.Scanner; 
class addition{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x,y,sum=0;
        System.out.println("enter 1st number");
        x=s.nextInt();
        System.out.println("enter 2nd number");
        y=s.nextInt();

        sum=x+y;
        System.out.println("sum ="+sum);
        
    }
}
