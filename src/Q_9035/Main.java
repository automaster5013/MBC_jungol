package Q_9035;

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        int max = Math.max(n1, Math.max(n2, n3));

        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;

        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;

        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");

        int[] numbers = new int[3];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();

        Arrays.sort(numbers); // 오름차순 정렬 (예: 1, 4, 5 순서로 배치됨)
        int max = numbers[2]; // 가장 마지막 원소가 최댓값

        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}



















