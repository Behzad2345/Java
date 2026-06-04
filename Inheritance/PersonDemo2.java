/*14. Create a class “Person” with a method “speak()” that displays a message “The
person is speaking”. Create two subclasses “Student” and “Teacher” that
extend “Person” and implement the “speak()” method to display “The student
is asking a question” and “The teacher is giving a lecture” respectively. */

class Person {
    void speak() {
        System.out.println("The person is speaking");
    }
}

class Student extends Person {
    void speak() {
        System.out.println("The student is asking a question");
    }
}

class Teacher extends Person {
    void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}

public class PersonDemo2 {
    public static void main(String[] args) {

        Person p = new Person();
        Student s = new Student();
        Teacher t = new Teacher();

        p.speak();
        s.speak();
        t.speak();
    }
}