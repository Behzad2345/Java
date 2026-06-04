//read n elements in 1D array and display the elements in reverse order and count the number of even and odd elements



import java.util.Scanner;

public class ReverseAndCount{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("enter no. of elements in array:");
        int n= s.nextInt();

        int[] arr= new int[n];

        System.out.println("enter the elements of array:");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }

        int even=0,odd=0;
        

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else
             odd++;
        }


        System.out.println("original aarray:");
 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }


        System.out.println("\nreversed array:");

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
        
        System.out.println("\neven count:"+even);
        
        System.out.println("odd count:"+odd);

        
    }
}