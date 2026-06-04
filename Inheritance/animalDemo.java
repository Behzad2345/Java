/*Create a class “Animal” with a method “makeSound()” that prints a sound. 
Create a subclass “Mammal” that extends “Animal” and adds a method 
“giveBirth()” 
that 
prints 
“Giving 
birth”. 
Create a subclass “Dog” that extends “Mammal” and overrides the 
“makeSound()” 
method 
to 
print 
“Woof!”. 
Create an object of the “Animal” class and call the “makeSound()” method. 
Create an object of the “Mammal” class and call the “makeSound()” and 
“giveBirth()” 
methods. 
Create an object of the “Dog” class and call the “makeSound()” and 
“giveBirth()” methods.  */

class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Mammal extends Animal {

    void giveBirth() {
        System.out.println("Giving birth");
    }
}

class Dog extends Mammal {

    @Override
    void makeSound() {
        System.out.println("Woof....");
    }
}

public class animalDemo {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        System.out.println();

        Mammal m = new Mammal();
        m.makeSound();
        m.giveBirth();

        System.out.println();

        Dog d = new Dog();
        d.makeSound();
        d.giveBirth();
    }
}
