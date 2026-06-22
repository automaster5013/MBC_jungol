package Q_12338;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
                if (i != b) {
                    System.out.println();
                }
            }
        }
        else {
            for (int i = a; i >= b; i--) {
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
                if (i != b) {
                    System.out.println();
                }
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;

        int currentForm = a;
        while (true) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(currentForm + " * " + j + " = " + (currentForm * j));
            }

            if (currentForm == b) {
                break;
            }

            System.out.println();
            currentForm += step;
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int distance = b - a;
        int step = (distance >= 0) ? 1 : -1;
        int loopCount = (distance >= 0) ? distance : -distance;

        for (int i = 0; i <= loopCount; i++) {
            int targetDan = a + (i * step);

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", targetDan, j, targetDan * j);
            }

            if (i != loopCount) {
                System.out.println();
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= 9; j++) {
                    sb.append(i).append(" * ").append(j).append(" = ").append(i * j).append("\n");
                }
                sb.append("\n");
            }
        } else {
            for (int i = a; i >= b; i--) {
                for (int j = 1; j <= 9; j++) {
                    sb.append(i).append(" * ").append(j).append(" = ").append(i * j).append("\n");
                }
                sb.append("\n");
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb.toString());
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printDanRecursive(a, b, a <= b);
    }

    public static void printDanRecursive(int current, int target, boolean isAscending) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(current + " * " + j + " = " + (current * j));
        }

        if (current == target) {
            return;
        }

        System.out.println();

        if (isAscending) {
            printDanRecursive(current + 1, target, isAscending);
        } else {
            printDanRecursive(current - 1, target, isAscending);
        }
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;

        int currentInp = a;
        while (true) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(currentInp + " * " + j + " = " + (currentInp * j));
            }

            if (currentInp == b) {
                break;
            }

            System.out.println();
            currentInp += step;
        }
        sc.close();
    }
}






























