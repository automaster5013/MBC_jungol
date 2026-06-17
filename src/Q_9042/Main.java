package Q_9042;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;

            System.out.println("입력된 자료의 개수 = " + count);
            System.out.println("입력된 자료의 합계 = " + sum);
            System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
        } else {
            System.out.println("입력된 자료가 없습니다.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num;

        while ((num = sc.nextInt()) != 0) {
            sum += num;
            count++;
        }

        if (count > 0) {
            System.out.println("입력된 자료의 개수 = " + count);
            System.out.println("입력된 자료의 합계 = " + sum);
            System.out.printf("입력된 자료의 평균 = %.2f\n", (double) sum / count);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (;;) {
            int num = sc.nextInt();
            if (num == 0) break;

            sum += num;
            count++;
        }

        if (count > 0) {
            double rawAvg = (double) sum / count;
            double roundedAvg = Math.round(rawAvg * 100.0) / 100.0;

            System.out.println("입력된 자료의 개수 = " + count);
            System.out.println("입력된 자료의 합계 = " + sum);
            System.out.println("입력된 자료의 평균 = " + roundedAvg);
        }
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int sum = 0;
        int count = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("0")) {
                break;
            }
            sum += Integer.parseInt(tokens[i]);
            count++;
        }

        if (count > 0) {
            System.out.print("입력된 자료의 개수 = " + count + "\n");
            System.out.print("입력된 자료의 합계 = " + sum + "\n");
            System.out.printf("입력된 자료의 평균 = %.2f\n", (double) sum / count);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stats = new int[2];

        calculateRecursive(sc, stats);

        if (stats[1] > 0) {
            System.out.println("입력된 자료의 개수 = " + stats[1]);
            System.out.println("입력된 자료의 합계 = " + stats[0]);
            System.out.printf("입력된 자료의 평균 = %.2f\n", (double) stats[0] / stats[1]);
        }
    }

    public static void calculateRecursive(Scanner sc, int[] stats) {
        int num = sc.nextInt();

        if (num == 0) {
            return;
        }

        stats[0] += num; // 합계 누적
        stats[1]++;      // 개수 증가

        calculateRecursive(sc, stats);
    }
}

 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int sum = 0;
        int count = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("0")) {
                break;
            }
            sum += Integer.parseInt(tokens[i]);
            count++;
        }
        br.close();

        if (count > 0) {
            System.out.print("입력된 자료의 개수 = " + count + "\n");
            System.out.print("입력된 자료의 합계 = " + sum + "\n");
            System.out.printf("입력된 자료의 평균 = %.2f\n", (double) sum / count);
        }
    }
}































