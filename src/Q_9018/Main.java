package Q_9018;

public class Main {
    public static void main(String[] args) {
        System.out.print("두 개의 수를 입력하시오. ");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, (a + b));
        System.out.printf("%d - %d = %d\n", a, b, (a - b));
        System.out.printf("%d * %d = %d\n", a, b, (a * b));
        System.out.printf("%d / %d = %d\n", a, b, (a / b));
        System.out.printf("%d %% %d = %d\n", a, b, (a % b));
    }
}