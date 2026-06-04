//print area and perimeter of circle and rectangle

import java.util.Scanner;
public class AreaPeri{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("choose, area and perimeter of:\n 1. circle\n 2. rectangle");
        int choice=s.nextInt();
         if(choice==1){
            System.out.println("enter radius of circle:");
            double radius= s.nextDouble();

            double circleA= Math.PI*radius*radius;
            double circleP= 2*Math.PI*radius;

            System.out.println("circle area="+circleA+"\n circle perimeter="+circleP);

         } 

         else if(choice==2){
            System.out.println("enter length of rectangle");
            double len= s.nextDouble();
            System.out.println("enter breadth of rectangle");
            double b= s.nextDouble();

            double recA=len*b;
            double recP=2*(len+b);

            System.out.println("rectangle area="+recA+"\n rectangle perimeter="+recP);

         }

         else{
            System.out.println("invalid option");
         }
        
        
        
        }
}