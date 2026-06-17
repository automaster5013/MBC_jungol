package Q_9067;
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] targets = new int[3];

        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();

            if (i == 2) targets[0] = input;
            else if (i == 4) targets[1] = input;
            else if (i == 9) targets[2] = input;
        }
        sc.close();

        System.out.printf("%d %d %d\n", targets[0], targets[1], targets[2]);
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");

        System.out.print(tokens[2] + " " + tokens[4] + " " + tokens[9] + "\n");
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int third = 0, fifth = 0, last = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            switch (i) {
                case 2:  third = num; break;
                case 4:  fifth = num; break;
                case 9:  last = num;  break;
            }
        }
        sc.close();

        System.out.println(third + " " + fifth + " " + last);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] result = new int[3];
        readRecursive(sc, 0, result);

        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static void readRecursive(java.util.Scanner sc, int count, int[] result) {
        if (count == 10) return;

        int num = sc.nextInt();

        if (count == 2) result[0] = num;
        if (count == 4) result[1] = num;
        if (count == 9) result[2] = num;

        readRecursive(sc, count + 1, result);
    }
}
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(arr[2] + " " + arr[4] + " " + arr[9]);
    }
}






















