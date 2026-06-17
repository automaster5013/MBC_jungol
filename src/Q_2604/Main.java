package Q_2604;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.next();

        int height = 10;

        for (int i = 1; i < bowls.length(); i++) {
            if (bowls.charAt(i) == bowls.charAt(i - 1)) {
                height += 5;
            }
            else {
                height += 10;
            }
        }
        sc.close();

        System.out.println(height);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.next();

        int height = 0;
        char prev = ' ';

        for (char current : bowls.toCharArray()) {
            if (prev == ' ') {
                height += 10;
            }
            else if (current == prev) {
                height += 5;
            }
            else {
                height += 10;
            }

            prev = current;
        }
        sc.close();

        System.out.println(height);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.next();

        int height = 10;

        for (int i = 1; i < bowls.length(); i++) {
            height += (bowls.charAt(i) == bowls.charAt(i - 1)) ? 5 : 10;
        }
        sc.close();

        System.out.println(height);
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().trim().toCharArray();

        int height = 10;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                height += 5;
            } else {
                height += 10;
            }
        }
        br.close();

        System.out.print(height + "\n");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.next();

        int totalHeight = calculate(bowls, 1, bowls.charAt(0));
        System.out.println(totalHeight);
    }

    public static int calculate(String str, int idx, char lastBowl) {
        if (idx == str.length()) {
            return 10;
        }
        if (idx == str.length()) {
            return 0;
        }

        char currentBowl = str.charAt(idx);
        int currentScore = (currentBowl == lastBowl) ? 5 : 10;

        return currentScore + calculate(str, idx + 1, currentBowl);
    }
}
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.next();

        int height = 10;

        for (int i = 1; i < bowls.length(); i++) {
            height += (bowls.charAt(i) == bowls.charAt(i - 1)) ? 5 : 10;
        }
        sc.close();

        System.out.println(height);
    }
}



















