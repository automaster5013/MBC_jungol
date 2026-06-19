package Q_9052;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for (int score : scores) {
            sum += score;
        }
        sc.close();

        double avg = (double) sum / 5;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", avg);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        sc.close();

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", sum / 5.0);
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < tokens.length; i++) {
            sum += Integer.parseInt(tokens[i]);
        }
        br.close();

        double avg = (double) sum / tokens.length;

        System.out.print("총점 : " + sum + "\n");
        System.out.printf("평균 : %.1f\n", avg);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();

        double rawAvg = (double) sum / 5;
        double roundedAvg = Math.round(rawAvg * 10.0) / 10.0;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + roundedAvg);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = getSumRecursive(sc, 0);

        System.out.println("총점 : " + totalSum);
        System.out.printf("평균 : %.1f\n", totalSum / 5.0);
    }

    public static int getSumRecursive(Scanner sc, int studentCount) {
        if (studentCount == 5) {
            return 0;
        }

        int currentScore = sc.nextInt();
        return currentScore + getSumRecursive(sc, studentCount + 1);
    }
}

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for (int score : scores) {
            sum += score;
        }
        sc.close();

        double avg = (double) sum / 5;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", avg);
    }
}



















