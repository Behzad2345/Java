/*12. Create a class “Animal” with a method “move()” that displays a message “The
animal is moving”. Create two subclasses “Bird” and “Fish” that extend
“Animal” and implement the “move()” method to display “The bird is flying”
and “The fish is swimming” respectively */

class Animal {
    void move() {
        System.out.println("The animal is moving");
    }
}

class Bird extends Animal {
    void move() {
        System.out.println("The bird is flying");
    }
}

class Fish extends Animal {
    void move() {
        System.out.println("The fish is swimming");
    }
}

public class AnimalDemo2 {
    public static void main(String[] args) {

        Animal a = new Animal();
        Bird b = new Bird();
        Fish f = new Fish();

        a.move();
        b.move();
        f.move();
    }
}