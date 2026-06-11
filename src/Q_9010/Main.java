package Q_9010;
/*
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        b = (a + b) - (a = b);

        System.out.println(a + " " + b);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[] arr = {a, b};
        a = arr[1];
        b = arr[0];

        System.out.println(a + " " + b);
    }
}






