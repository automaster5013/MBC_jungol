package Q_9108;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);

            System.out.printf("%c -> %d\n", ch, (int) ch);

            if (ch == '0') {
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        while (true) {
            int ascii = System.in.read();

            if (ascii == ' ' || ascii == '\n') {
                continue;
            }

            System.out.println((char) ascii + " -> " + ascii);

            if (ascii == 48) {
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            char ch = sc.next().charAt(0);

            sb.append(ch).append(" -> ").append((int) ch).append("\n");

            if (ch == '0') {
                break;
            }
        }

        System.out.print(sb.toString());
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        convertRecursive(sc);
    }

    public static void convertRecursive(Scanner sc) {
        char ch = sc.next().charAt(0);

        System.out.println(ch + " -> " + (int) ch);

        if (ch == '0') {
            return;
        }
        convertRecursive(sc);
    }
}
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);

            int ascii = (int) ch;

            System.out.println(ch + " -> " + ascii);

            if (ch == '0') {
                break;
            }
        }
    }
}

















