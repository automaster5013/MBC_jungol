package Q_9043;
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

            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        sc.close();

        if (count > 0) {
            int avg = sum / count;

            System.out.println("홀수의 합 = " + sum);
            System.out.println("홀수의 평균 = " + avg);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int sum = 0;
        int count = 0;

        for (int i = 0; i < tokens.length; i++) {
            int num = Integer.parseInt(tokens[i]);

            if (num == 0) {
                break;
            }

            if ((num & 1) == 1) {
                sum += num;
                count++;
            }
        }
        br.close();

        if (count > 0) {
            System.out.print("홀수의 합 = " + sum + "\n");
            System.out.print("홀수의 평균 = " + (sum / count) + "\n");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        for (;;) {
            int num = sc.nextInt();
            if (num == 0) break;

            boolean isOdd = (num % 2 != 0);
            sum += isOdd ? num : 0;
            count += isOdd ? 1 : 0;
        }
        sc.close();

        if (count > 0) {
            System.out.println("홀수의 합 = " + sum);
            System.out.println("홀수의 평균 = " + (sum / count));
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;

            if (val % 2 != 0) {
                sum += val;
                count++;
            }
        }
        sc.close();

        if (count > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("홀수의 합 = ").append(sum).append("\n");
            sb.append("홀수의 평균 = ").append(sum / count).append("\n");
            System.out.print(sb.toString());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] results = new int[2];

        collectOddRecursive(sc, results);

        if (results[1] > 0) {
            System.out.println("홀수의 합 = " + results[0]);
            System.out.println("홀수의 평균 = " + (results[0] / results[1]));
        }
    }

    public static void collectOddRecursive(Scanner sc, int[] container) {
        int input = sc.nextInt();

        if (input == 0) {
            return;
        }

        if (input % 2 != 0) {
            container[0] += input;
            container[1]++;
        }

        collectOddRecursive(sc, container);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;

            if (val % 2 != 0) {
                sum += val;
                count++;
            }
        }
        sc.close();

        if (count > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("홀수의 합 = ").append(sum).append("\n");
            sb.append("홀수의 평균 = ").append(sum / count).append("\n");
            System.out.print(sb.toString());
        }
    }
}


















