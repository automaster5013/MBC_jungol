package Q_614;

/*
import java.util.Scanner;

class Student {
    String school;
    int grade;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.school = "Jejuelementary";
        s1.grade = 6;

        Student s2 = new Student();
        s2.school = sc.next();
        s2.grade = sc.nextInt();

        System.out.println(s1.grade + " grade in " + s1.school + " School");
        System.out.println(s2.grade + " grade in " + s2.school + " School");
    }
}

import java.util.Scanner;

class StudentInfo {
    String school;
    int grade;

    public StudentInfo(String school, int grade) {
        this.school = school;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentInfo s1 = new StudentInfo("Jejuelementary", 6);

        StudentInfo s2 = new StudentInfo(sc.next(), sc.nextInt());

        System.out.printf("%d grade in %s School\n", s1.grade, s1.school);
        System.out.printf("%d grade in %s School\n", s2.grade, s2.school);
    }
}

import java.util.Scanner;

public class Main {
    static class Student {
        String schoolName;
        int schoolGrade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student first = new Student();
        first.schoolName = "Jejuelementary";
        first.schoolGrade = 6;

        Student second = new Student();
        second.schoolName = sc.next();
        second.schoolGrade = sc.nextInt();

        System.out.print(first.schoolGrade + " grade in " + first.schoolName + " School\n");
        System.out.print(second.schoolGrade + " grade in " + second.schoolName + " School\n");
    }
}

 */

import java.util.Scanner;

class StudentInfo {
    String school;
    int grade;

    public StudentInfo(String school, int grade) {
        this.school = school;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentInfo s1 = new StudentInfo("Jejuelementary", 6);
        StudentInfo s2 = new StudentInfo(sc.next(), sc.nextInt());
        sc.close();

        System.out.printf("%d grade in %s School\n", s1.grade, s1.school);
        System.out.printf("%d grade in %s School\n", s2.grade, s2.school);
    }
}






























