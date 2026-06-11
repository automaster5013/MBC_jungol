package Q_9039;
/*
public class Main {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabets.length(); i++) {
            System.out.print(alphabets.charAt(i));
        }
    }
}
*/

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}










































