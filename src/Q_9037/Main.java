package Q_9037;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                       (score >= 60) ? "D" : "F";

        System.out.println(grade);
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8     -> "B";
            case 7     -> "C";
            case 6     -> "D";
            default    -> "F";
        };

        System.out.println(grade);
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        sc.close();
    }
}

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        switch (score / 10) {
            case 10: case 9:
                System.out.println("A"); break;
            case 8:
                System.out.println("B"); break;
            case 7:
                System.out.println("C"); break;
            case 6:
                System.out.println("D"); break;
            default:
                System.out.println("F"); break;
        }
        sc.close();
    }
}











