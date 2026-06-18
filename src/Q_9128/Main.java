package Q_9128;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String intStr1 = sc.next();
        String intStr2 = sc.next();

        String doubleStr1 = sc.next();
        String doubleStr2 = sc.next();

        int num1 = Integer.parseInt(intStr1);
        int num2 = Integer.parseInt(intStr2);
        int intSum = num1 + num2;

        double dNum1 = Double.parseDouble(doubleStr1);
        double dNum2 = Double.parseDouble(doubleStr2);
        double doubleSum = dNum1 + dNum2;

        System.out.println(num1 + " + " + num2 + " = " + intSum);
        System.out.printf("%.2f + %.2f = %.2f\n", dNum1, dNum2, doubleSum);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] intTokens = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(intTokens[0]);
        int n2 = Integer.parseInt(intTokens[1]);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        String[] doubleTokens = sc.nextLine().split(" ");
        double d1 = Double.parseDouble(doubleTokens[0]);
        double d2 = Double.parseDouble(doubleTokens[1]);
        System.out.printf("%.2f + %.2f = %.2f\n", d1, d2, (d1 + d2));
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = br.readLine().split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        System.out.print(a + " + " + b + " = " + (a + b) + "\n");

        String[] line2 = br.readLine().split(" ");
        double c = Double.parseDouble(line2[0]);
        double d = Double.parseDouble(line2[1]);
        System.out.printf("%.2f + %.2f = %.2f\n", c, d, (c + d));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(a + " + " + b + " = " + (a + b));

        double c = Double.parseDouble(sc.next());
        double d = Double.parseDouble(sc.next());
        double sum = c + d;

        double roundedC = Math.round(c * 100.0) / 100.0;
        double roundedD = Math.round(d * 100.0) / 100.0;
        double roundedSum = Math.round(sum * 100.0) / 100.0;

        System.out.println(roundedC + " + " + roundedD + " = " + roundedSum);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        processStage(sc, 1);
    }

    public static void processStage(java.util.Scanner sc, int stage) {
        if (stage > 2) return;

        if (stage == 1) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.println(a + " + " + b + " = " + (a + b));
        } else {
            double c = Double.parseDouble(sc.next());
            double d = Double.parseDouble(sc.next());
            System.out.printf("%.2f + %.2f = %.2f\n", c, d, (c + d));
        }

        processStage(sc, stage + 1);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] intTokens = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(intTokens[0]);
        int n2 = Integer.parseInt(intTokens[1]);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        String[] doubleTokens = sc.nextLine().split(" ");
        double d1 = Double.parseDouble(doubleTokens[0]);
        double d2 = Double.parseDouble(doubleTokens[1]);
        System.out.printf("%.2f + %.2f = %.2f\n", d1, d2, (d1 + d2));
    }
}





























