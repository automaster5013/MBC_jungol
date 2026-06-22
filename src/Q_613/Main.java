package Q_613;

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        String[] info = br.readLine().split(" ");

        System.out.println("Name : " + info[0]);
        System.out.println("School : " + info[1]);
        System.out.println("Grade : " + info[2]);
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();

        System.out.printf("Name : %s\nSchool : %s\nGrade : %d\n", name, school, grade);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append("Name : ").append(sc.next()).append("\n");
        sb.append("School : ").append(sc.next()).append("\n");
        sb.append("Grade : ").append(sc.nextInt()).append("\n");

        System.out.print(sb.toString());
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printInfoRecursive(sc, 1);
    }

    public static void printInfoRecursive(java.util.Scanner sc, int stage) {
        if (stage > 3) return;

        if (stage == 1) {
            System.out.println("Name : " + sc.next());
        } else if (stage == 2) {
            System.out.println("School : " + sc.next());
        } else {
            System.out.println("Grade : " + sc.nextInt());
        }

        printInfoRecursive(sc, stage + 1);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();
        sc.close();

        Student st1 = new Student(name, school, grade);
        st1.print();
    }
}

    class Student {
        private String name;
        private String school;
        private int grade;

    public Student(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public void print() {
//        System.out.println("Name : " + name);
//        System.out.println("School : " + school);
//        System.out.println("Grade : " + grade);
        System.out.printf("Name : %s\nSchool : %s\nGrade : %d\n", name, school, grade);

    }
}




























