package Q_9117;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            str = str.substring(1) + str.substring(0, 1);

            System.out.println(str);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        String doubleStr = str + str;

        for (int i = 0; i < len; i++) {
            System.out.println(doubleStr.substring(i + 1, i + 1 + len));
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= len; j++) {
                int targetIdx = (i + j) % len;
                System.out.print(str.charAt(targetIdx));
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int len = sb.length();

        for (int i = 0; i < len; i++) {
            char first = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(first);

            System.out.println(sb.toString());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        rotateRecursive(str, 0, str.length());
    }

    public static void rotateRecursive(String currentStr, int count, int totalLength) {
        if (count == totalLength) {
            return;
        }

        String nextStr = currentStr.substring(1) + currentStr.substring(0, 1);
        System.out.println(nextStr);

        rotateRecursive(nextStr, count + 1, totalLength);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            str = str.substring(1) + str.substring(0, 1);

            System.out.println(str);
        }
        sc.close();
    }
}



















