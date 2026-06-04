/* Create a class “Person” with fields “name” and “age” and a method 
“display()” that prints the name and age of the person. Create a subclass 
“Employee” that extends “Person” and adds a field “salary” and a method 
“display()” that prints the name, age, and salary of the employee. 
Create an object of the “Person” class and call the “display()” method. Create 
an object of the `Employee` class and call the “display()” method.  */

class person{
    String name;
    int age;

    void display(String name,int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
        
    }
}

class employee extends person{
    double salary;
     
    void display(String name,int age,double salary){
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("salary="+salary);
    }

}

public class personDemo {
    public static void main(String[] args){
        person p=new person();
        employee e=new employee();
        p.display("hadiya",22);
        e.display("sabha",33,20000);


    }
    
}
