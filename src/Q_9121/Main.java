package Q_9121;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = {
            "champion", "tel", "pencil", "jungol", "olympiad",
            "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        String inputStr = sc.next().substring(0, 1);

        int matchCount = 0;

        for (String word : words) {
            if (word.startsWith(inputStr)) {
                System.out.println(word);
                matchCount++;
            }
        }
        sc.close();

        if (matchCount == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {
            "champion", "tel", "pencil", "jungol", "olympiad",
            "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        char inputChar = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) == inputChar) {
                System.out.println(words[i]);
                found = true;
            }
        }
        sc.close();

        if (!found) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {
            "champion", "tel", "pencil", "jungol", "olympiad",
            "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        String target = sc.next().substring(0, 1);

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.startsWith(target)) {
                sb.append(word).append("\n");
            }
        }
        sc.close();

        if (sb.length() == 0) {
            System.out.println("찾는 단어가 없습니다.");
        } else {
            System.out.print(sb.toString());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {
            "champion", "tel", "pencil", "jungol", "olympiad",
            "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        String search = sc.next().substring(0, 1);

        int check = 0;
        for (String w : words) {
            if (w.indexOf(search) == 0) {
                System.out.println(w);
                check++;
            }
        }
        sc.close();

        if (check == 0) System.out.println("찾는 단어가 없습니다.");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {
            "champion", "tel", "pencil", "jungol", "olympiad",
            "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        char target = sc.next().charAt(0);

        int finalMatches = searchRecursive(words, target, 0, 0);

        if (finalMatches == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }

    public static int searchRecursive(String[] arr, char target, int idx, int count) {
        if (idx == arr.length) {
            return count;
        }

        if (arr[idx].charAt(0) == target) {
            System.out.println(arr[idx]);
            count++;
        }

        return searchRecursive(arr, target, idx + 1, count);
    }
}
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = {
                "champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        String inputStr = sc.next().substring(0, 1);

        int matchCount = 0;

        for (String word : words) {
            if (word.startsWith(inputStr)) {
                System.out.println(word);
                matchCount++;
            }
        }
        sc.close();

        if (matchCount == 0) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}





























