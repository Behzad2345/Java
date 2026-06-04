package student;

public class PGStudent implements Result {

    String name;
    int[] marks = new int[5];

    public PGStudent(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void calculateGrade() {

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "D";

        System.out.println("\nPG Student");
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }
}