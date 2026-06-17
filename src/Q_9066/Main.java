package Q_9066;
/*
public class Main {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 25; i >= 0; i--) {
            System.out.print(alphabet[i] + " ");
        }
        sc.close();
    }
}

public class Main {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        char ch = 'A';
        for (int i = alphabet.length - 1; i >= 0; i--) {
            alphabet[i] = ch;
            ch++;
        }

        for (char alpha : alphabet) {
            System.out.print(alpha + " ");
        }
        sc.close();
    }
}

public class Main {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
            sb.append(alphabet[i]).append(" ");
        }
        sc.close();

        System.out.print(sb.reverse().toString().trim());
    }
}

public class Main {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        reversePrint(alphabet, 0);
    }

    public static void reversePrint(char[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        reversePrint(arr, index + 1);

        System.out.print(arr[index] + " ");
    }
}
*/
public class Main {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        char current = 'A';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = current;
            current++;
        }

        for (int i = alphabet.length - 1; i >= 0; i--) {
            System.out.print(alphabet[i] + " ");
        }
    }
}





















