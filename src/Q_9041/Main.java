package Q_9041;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;

        while (isContinue) {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score >= 0 && score <= 100) {
                String msg = (score >= 80) ? "축하합니다. 합격입니다." : "죄송합니다. 불합격입니다.";
                System.out.println(msg);
            } else {
                isContinue = false;
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score < 0 || score > 100) return;

            System.out.println(score >= 80 ? "축하합니다. 합격입니다." : "죄송합니다. 불합격입니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        while (true) {
            System.out.print("점수를 입력하세요. ");
            int score = Integer.parseInt(br.readLine().trim());

            if (!(score >= 0 && score <= 100)) {
                break;
            }

            if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        processScore(sc);
    }

    public static void processScore(Scanner sc) {
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            return;
        }

        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
        } else {
            System.out.println("죄송합니다. 불합격입니다.");
        }

        processScore(sc);
    }
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score < 0 || score > 100) {
                break;
            }

            if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }
    }
}














