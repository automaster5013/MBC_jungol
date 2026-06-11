package Q_9036;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("삽입을 선택하셨습니다.");
        } else if (menu == 2) {
            System.out.println("수정을 선택하셨습니다.");
        } else if (menu == 3) {
            System.out.println("삭제를 선택하셨습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        String[] menuNames = {"", "삽입", "수정", "삭제"};

        if (menu >= 1 && menu < menuNames.length) {
            System.out.println(menuNames[menu] + "을 선택하셨습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        String result = switch (menu) {
            case 1 -> "삽입을 선택하셨습니다.";
            case 2 -> "수정을 선택하셨습니다.";
            case 3 -> "삭제를 선택하셨습니다.";
            default -> "잘못 입력하셨습니다.";
        };
        System.out.println(result);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        String target = "1삽입 2수정 3삭제";

        int index = target.indexOf(inputStr);

        if (index != -1) {
            String menuName = target.substring(index + 1, index + 3);
            System.out.println(menuName + "을 선택하셨습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("삽입을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("수정을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("삭제를 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }
}
