//to read n elements into a 1D array and find the sum, average, maximum and minimum values

import java.util.Scanner;

public class arrayStats{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("enter no. of elements in array:");
        int n= s.nextInt();

        int[] arr= new int[n];

        System.out.println("enter the elements of array:");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }

        int sum=0;
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++){
            sum+=arr[i];


            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }

        double avg=(double)sum/n;

        System.out.println("sum="+sum);
        System.out.println("average of elements of array="+avg);
        System.out.println("maximum="+max);
        System.out.println("minimun="+min);



    }
}