//search for a given element in 1d array and display its position(s)


import java.util.Scanner;

public class search{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("enter no. of elements in array:");
        int n= s.nextInt();

        int[] arr= new int[n];

        System.out.println("enter the elements of array:");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }

        System.out.println("enter the element you are searching for:");

        int x=s.nextInt();
boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
              found=true;

              System.out.println("found at position:"+(i+1));    //position, not index
            }

        }

        if(found==false){
            System.out.println("element not found");
        }
    }
}