package Q_9021;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.printf("최초값 a = %d, b = %d\n\n", a, b);
        System.out.printf("a++ = %d, ++b = %d\n", a++, ++b);
        System.out.printf("실행후 a = %d, b = %d\n\n", a, b);
        System.out.printf("a-- = %d, --b = %d\n", a--, --b);
        System.out.printf("실행후 a = %d, b = %d\n", a, b);
    }
}

/*
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 10;
        System.out.println("최초값 a = " + a + ", b = " + b + "\n");

        int printA = a;
        a = a + 1;

        b = b + 1;
        int printB = b;

        System.out.println("a++ = " + printA + ", ++b = " + printB);
        System.out.println("실행후 a = " + a + ", b = " + b + "\n");

        printA = a;
        a = a - 1;

        b = b - 1;
        printB = b;

        System.out.println("a-- = " + printA + ", --b = " + printB);
        System.out.println("실행후 a = " + a + ", b = " + b);
    }
}
*/