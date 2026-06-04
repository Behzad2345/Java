import java.util.Scanner;
public class leap{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter any year");
        int x=s.nextInt();

        if((x%4==0 && x%100!=0)||(x%400==0)){
            System.out.println("year is leap");

        }
        else{
            System.out.println("year is not leap");
        }

    }
}