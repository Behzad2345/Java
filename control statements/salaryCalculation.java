/*
compute salary using:
1. basic salary input
2. HRA=20% of basic if basic<=20k otherwise 30%
3.DA=80% of basic
4.tax=10% if gross salary>50k

display gross and net salary
 */


import java.util.Scanner;

public class salaryCalculation{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in); 

        System.out.println("enter basic salary:");
        double basic= s.nextDouble();

        double hra,da,tax=0;

        if(basic<=20000){     //HRA
            hra=0.2*basic;
        }
        else{
            hra=0.3*basic;
        }

        da=0.8*basic;    //DA

        double gross=basic+hra+da;       //gross

        if(gross>50000){    //TAX
           tax=0.1*gross;
        }

        double total= gross-tax;
        System.out.println("net salary="+total+"\n gross="+gross);

    }
}