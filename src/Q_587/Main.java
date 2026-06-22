package Q_587;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRecursive(0, n);
    }

    public static void printRecursive(int count, int target) {
        if (count == target) {
            return;
        }

        System.out.println("recursive");

        printRecursive(count + 1, target);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        startCountdown(n);
    }

    public static void startCountdown(int remaining) {
        if (remaining == 0) {
            return;
        }

        System.out.println("recursive");

        startCountdown(remaining - 1);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        runLoop(n);
    }

    public static void runLoop(int n) {
        if (n > 0) {
            System.out.println("recursive");
            runLoop(n - 1);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        buildString(n, sb);

        System.out.print(sb.toString());
    }

    public static void buildString(int n, StringBuilder sb) {
        if (n == 0) {
            return;
        }

        sb.append("recursive\n");
        buildString(n - 1, sb);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(generateText(n));
    }

    public static String generateText(int n) {
        return (n < 1) ? "" : "recursive\n" + generateText(n - 1);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRecursive(0, n);
    }

    public static void printRecursive(int count, int target) {
        if (count == target) {
            return;
        }

        System.out.println("recursive");

        printRecursive(count + 1, target);
    }
}