package Q_111;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int mat = sc.nextInt();
        int com = sc.nextInt();

        int sum = kor + eng + mat + com;
        int avg = sum / 4;

        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[4];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        int avg = sum / scores.length;

        System.out.printf("sum %d\navg %d\n", sum, avg);
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < tokens.length; i++) {
            sum += Integer.parseInt(tokens[i]);
        }

        int avg = sum / tokens.length;

        System.out.print("sum " + sum + "\navg " + avg + "\n");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 4) {
            sum += sc.nextInt();
            count++;
        }

        System.out.println("sum " + sum + "\navg " + (sum / 4));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();

        int avg = sum >> 2;

        System.out.printf("sum %d\navg %d\n", sum, avg);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[4];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        sc.close();

        int avg = sum / scores.length;

        System.out.printf("sum %d\navg %d\n", sum, avg);
    }
}





















