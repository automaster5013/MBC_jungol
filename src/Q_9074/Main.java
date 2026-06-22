package Q_9074;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] counts = new int[11];

        while (true) {
            int num = sc.nextInt();

            if (num < 1 || num > 10) {
                break;
            }

            counts[num]++;
        }

        for (int i = 1; i <= 10; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " : " + counts[i] + "개");
            }
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

        int[] frequencies = new int[11];

        for (int i = 0; i < tokens.length; i++) {
            int num = Integer.parseInt(tokens[i]);

            if (num < 1 || num > 10) {
                break;
            }
            frequencies[num]++;
        }

        for (int i = 1; i <= 10; i++) {
            if (frequencies[i] != 0) {
                System.out.printf("%d : %d개\n", i, frequencies[i]);
            }
        }
        br.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] compactBox = new int[10];

        for (;;) {
            int num = sc.nextInt();
            if (num < 1 || num > 10) break;

            compactBox[num - 1]++;
        }

        for (int i = 0; i < compactBox.length; i++) {
            if (compactBox[i] > 0) {
                System.out.println((i + 1) + " : " + compactBox[i] + "개");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] map = new int[11];

        while (true) {
            int current = sc.nextInt();
            if (current < 1 || current > 10) break;
            map[current]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (map[i] > 0) {
                sb.append(i).append(" : ").append(map[i]).append("개\n");
            }
        }

        System.out.print(sb.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] finalCounts = new int[11];

        recordRecursive(sc, finalCounts);

        for (int i = 1; i <= 10; i++) {
            if (finalCounts[i] > 0) {
                System.out.println(i + " : " + finalCounts[i] + "개");
            }
        }
    }

    public static void recordRecursive(java.util.Scanner sc, int[] arr) {
        int input = sc.nextInt();

        if (input < 1 || input > 10) {
            return;
        }

        arr[input]++;

        recordRecursive(sc, arr);
    }
}
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int[] counts = new int[11];

        for (int i = 0; i < tokens.length; i++) {
            int num = Integer.parseInt(tokens[i]);

            if (num < 1 || num > 10) {
                break;
            }
            counts[num]++;
        }

        for (int i = 1; i <= 10; i++) {
            if (counts[i] != 0) {
                System.out.printf("%d : %d개\n", i, counts[i]);
            }
        }
        br.close();
    }
}
















