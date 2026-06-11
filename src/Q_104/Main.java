package Q_104;

/*
public class Main {
    public static void main(String[] args) {
        int kor = 90;
        int mat = 80;
        int eng = 100;

        // 변수를 활용한 수식(산술 연산) 적용
        int sum = kor + mat + eng;

        System.out.println("kor " + kor);
        System.out.println("mat " + mat);
        System.out.println("eng " + eng);
        System.out.println("sum " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        int kor = 90, mat = 80, eng = 100;

        System.out.printf("kor %d\n", kor);
        System.out.printf("mat %d\n", mat);
        System.out.printf("eng %d\n", eng);
        // 괄호 안에서 변수들의 더하기 수식이 먼저 실행됩니다.
        System.out.printf("sum %d\n", (kor + mat + eng));
    }
}

public class Main {
    public static void main(String[] args) {
        // 크기가 4인 배열 선언 (0: kor, 1: mat, 2: eng, 3: sum)
        int[] scores = new int[4];
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 100;

        // 배열 요소를 이용한 수식 계산
        scores[3] = scores[0] + scores[1] + scores[2];

        System.out.println("kor " + scores[0]);
        System.out.println("mat " + scores[1]);
        System.out.println("eng " + scores[2]);
        System.out.println("sum " + scores[3]);
    }
}

public class Main {
    public static void main(String[] args) {
        int kor = 90;
        int mat = 80;
        int eng = 100;

        int sum = 0; // 0으로 출발
        sum += kor;  // sum = sum + kor; (90)
        sum += mat;  // sum = sum + mat; (170)
        sum += eng;  // sum = sum + eng; (270)

        System.out.print("kor " + kor + "\nmat " + mat + "\nneng " + eng + "\nsum " + sum + "\n");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"kor", "mat", "eng"};
        int[] scores = {90, 80, 100};
        int sum = 0;

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%s %d\n", subjects[i], scores[i]);
            sum += scores[i];
        }
        System.out.printf("sum %d\n", sum);
    }
}