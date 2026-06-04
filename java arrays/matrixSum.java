//read matrix using a 2d arrays and compute the sum of each row and column

import java.util.Scanner;

public class matrixSum{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("enter no. of rows:");
        int r= s.nextInt();
        
        System.out.println("enter no. of columns:");
        int c= s.nextInt();

        int[][] arr= new int[r][c];

        System.out.println("enter the elements of matrix row by row:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

            arr[i][j]=s.nextInt();
            }

        }

        //print matrix
        System.out.println("your matrix:");
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");

        }


        //row sum
        for(int i=0;i<r;i++){
            int rowSum=0;
            for(int j=0;j<c;j++){
                rowSum+=arr[i][j];
            }

            System.out.println("sum of elements of row "+(i+1)+"="+rowSum);
        }

        
        //column sum
        for(int j=0;j<c;j++){
            int colSum=0;
            for(int i=0;i<r;i++){
                colSum+=arr[i][j];
            }

            System.out.println("sum of elements of column "+(j+1)+"="+colSum);
        }
    }
}