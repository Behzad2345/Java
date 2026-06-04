//find quadrant or axis of a point
//print area and perimeter of circle and rectangle

import java.util.Scanner;
public class coordinates{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

       
            System.out.println("enter x of point");
            double x= s.nextDouble();
            System.out.println("enter y of point");
            double y= s.nextDouble();

            if(x==0 && y==0){
                System.out.println("point is at origin");
            }
            else if(x!=0 && y==0){
                System.out.println("point is at x-axis");
            }
            else if(x==0 && y!=0){
                System.out.println("point is at y-axis");
            }
            else if(x>0 && y>0){
                System.out.println("point is in 1st quadrant");
            }
             else if(x>0 && y<0){
                System.out.println("point is in 4th quadrant");
            }
             else if(x<0 && y>0){
                System.out.println("point is in 2nd quadrant");
            }
             else if(x<0 && y<0){
                System.out.println("point is in 3rd quadrant");
            }
            
            



           
        
        }
}