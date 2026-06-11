package Q_9032;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String result = (score >= 80) ? "축하합니다. 합격입니다." : "죄송합니다. 불합격입니다.";

        System.out.println(result);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int score = sc.nextInt();

        // 인덱스 0에는 불합격 메시지, 1에는 합격 메시지를 배치
        String[] messages = {"죄송합니다. 불합격입니다.", "축하합니다. 합격입니다."};

        // 점수가 80 이상이면 passIdx는 1이 되고, 80 미만이면 0이 되는 논리 변환 연산
        // (score / 80)을 활용하여 80 이상인 순간 1 이상의 숫자가 되도록 유도하고, 최대 1로 제한
        int passIdx = (score >= 80) ? 1 : 0;

        System.out.println(messages[passIdx]);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int score = sc.nextInt();

        // 80점 이상이면 출력 후 메서드 즉시 탈출
        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
            return;
        }

        // 위의 if문을 통과했다는 것은 무조건 80점 미만이라는 의미이므로 else 없이 실행
        System.out.println("죄송합니다. 불합격입니다.");
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("점수를 입력하세요. ");

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        // 입력 문자열을 정수로 파싱
        int score = Integer.parseInt(br.readLine().trim());

        String status = "죄송합니다. 불합격";
        if (score >= 80) {
            status = "축하합니다. 합격";
        }

        System.out.printf("%s입니다.\n", status);
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
        } else {
            System.out.println("죄송합니다. 불합격입니다.");
        }
    }
}




















