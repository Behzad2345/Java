//read two 1d aarrays and merge them into a single array,then display the merged array in sorted order

import java.util.Scanner;

public class mergeAndSort{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("enter no. of elements in first array:");
        int n= s.nextInt();

        int[] arr1= new int[n];

        System.out.println("enter the elements of first array:");

        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();

        }

        
        System.out.println("enter no. of elements in 2nd array:");
        int m= s.nextInt();

        int[] arr2= new int[m];

        System.out.println("enter the elements of 2nd array array:");

        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();

        }


      int[] merged= new int[n+m];

      for(int i=0;i<n;i++){
        merged[i]=arr1[i];
      }

      
      for(int i=0;i<m;i++){
        merged[n+i]=arr2[i];
      }


      //bubble sorted

      int k=merged.length-1;
      for(int i=0;i<k;i++){
        for(int j=0;j<k-i;j++){
            if(merged[j]>merged[j+1]){

                int temp=merged[j];
                merged[j]=merged[j+1];
                merged[j+1]=temp;
            }
        }
      }
      System.out.println("\n");
      
      System.out.println("first array:");
      for(int i=0;i<n;i++){
        System.out.print(arr1[i]+" ");
      }
         System.out.println("\n");
      
      System.out.println("second array:");
      for(int i=0;i<m;i++){
        System.out.print(arr2[i]+" ");
      }
      System.out.println("\n");

      System.out.println("merged and sorted array:");
      for(int i=0;i<k;i++){
        System.out.print(merged[i]+" ");
      }
    }
}