package Q_9006;

/*
public class Main {
    public static void main(String[] args) {
        System.out.printf("%s\n%d\n%.6f\n", "수를 출력할 때는 따옴표를 생략합니다.", 123, 6.5);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        String message = "수를 출력할 때는 따옴표를 생략합니다.";
        int num1 = 123;
        double num2 = 6.5;

        System.out.println(message);
        System.out.println(num1);
        System.out.printf("%.6f\n", num2);
    }
}

