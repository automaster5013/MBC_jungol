package Q_9008;
/*
public class Main {
    public static void main(String[] args) {
        System.out.println(" subject score");

        for (int i = 0; i < 14; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.println("  korean    90");
        System.out.println(" english   100");
        System.out.println("computer    80");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"korean", "english", "computer"};
        int[] scores = {90, 100, 80};

        System.out.printf("%8s %5s\n", "subject", "score");
        System.out.println("==============");

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%8s %5d\n", subjects[i], scores[i]);
        }
    }
}