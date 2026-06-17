package Q_9051;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                cnt++;
            }
        }
        sc.close();

        System.out.printf("입력받은 짝수는 %d개입니다.\n", cnt);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            // 맨 끝 비트가 0이면 짝수(true)이므로 1을 더하고, 홀수(false)면 0을 더합니다.
            cnt += ((sc.nextInt() & 1) == 0) ? 1 : 0;
        }
        sc.close();

        System.out.println("입력받은 짝수는 " + cnt + "개입니다.");
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < tokens.length; i++) {
            int num = Integer.parseInt(tokens[i]);

            // 음수 정수 입력까지 완벽히 대비하기 위한 절대값 보정 수식
            int remainder = num % 2;
            if (remainder < 0) remainder = -remainder;

            // 짝수(remainder가 0)일 때는 1이 더해지고, 홀수(remainder가 1)일 때는 0이 더해집니다.
            cnt += (1 - remainder);
        }
        sc.close();

        System.out.print("입력받은 짝수는 " + cnt + "개입니다.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0번째 차례부터 카운팅 시작하도록 재귀 함수 가동
        int totalEvens = countEvens(sc, 0);
        System.out.println("입력받은 짝수는 " + totalEvens + "개입니다.");
    }

    public static int countEvens(java.util.Scanner sc, int step) {
        // 기저 조건: 10개를 모두 확인했다면 0을 리턴하며 재귀 탈출
        if (step == 10) {
            return 0;
        }

        int num = sc.nextInt();
        // 현재 숫자가 짝수라면 1을 확보하고, 홀수라면 0을 확보합니다.
        int currentScore = (num % 2 == 0) ? 1 : 0;

        // 내 점수(currentScore) + 다음 회차에서 계산되어 올라올 짝수의 총합
        return currentScore + countEvens(sc, step + 1);
    }
}
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                cnt++;
            }
        }
        sc.close();

        System.out.println("입력받은 짝수는 " + cnt + "개입니다.");
    }
}

















