package Q_104;

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