package Q_9063;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        // 한 줄 전체를 읽어옴 (예: "5 10 9 3 2")
        String line = br.readLine();

        // 공백을 기준으로 문자열을 쪼개어 문자열 배열로 만듦
        String[] tokens = line.split(" ");

        // 문자열 배열을 순회하며 그대로 출력
        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i] + " ");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 재귀 함수 시작 (카운트 0부터 출발)
        readAndPrint(sc, 0);
    }

    public static void readAndPrint(java.util.Scanner sc, int count) {
        // 기저 조건 (Base Case): 5번 입력받았으면 재귀 종료
        if (count == 5) {
            return;
        }

        // 현재 순서의 숫자를 입력받음
        int num = sc.nextInt();

        // 1. 내가 먼저 출력하고 (차례대로 출력해야 하므로)
        System.out.print(num + " ");

        // 2. 다음 숫자를 읽으러 깊숙이 들어감
        readAndPrint(sc, count + 1);
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



















