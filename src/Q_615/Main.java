package Q_615;
/*
import java.util.Scanner;

// 1. C언어의 구조체 역할을 하는 Student 클래스 정의
class Student {
    String name;
    int kor;
    int eng;

    // 생성자를 통해 객체 생성 시 데이터를 한 번에 주입
    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2. 입력받은 데이터로 각각의 Student 객체(구조체 변수) 생성
        Student s1 = new Student(sc.next(), sc.nextInt(), sc.nextInt());
        Student s2 = new Student(sc.next(), sc.nextInt(), sc.nextInt());

        // 3. 객체의 필드(멤버 변수)에 접근하여 평균 계산
        int korAvg = (s1.kor + s2.kor) / 2;
        int engAvg = (s1.eng + s2.eng) / 2;

        // 4. 결과 출력
        System.out.println(s1.name + " " + s1.kor + " " + s1.eng);
        System.out.println(s2.name + " " + s2.kor + " " + s2.eng);
        System.out.println("avg " + korAvg + " " + engAvg);

        sc.close();
    }
}
 */

import java.util.Scanner;

class Student {
    String name;
    int kor;
    int eng;

    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(sc.next(), sc.nextInt(), sc.nextInt());
        Student s2 = new Student(sc.next(), sc.nextInt(), sc.nextInt());

        int korAvg = (s1.kor + s2.kor) / 2;
        int engAvg = (s1.eng + s2.eng) / 2;

        System.out.println(s1.name + " " + s1.kor + " " + s1.eng);
        System.out.println(s2.name + " " + s2.kor + " " + s2.eng);
        System.out.println("avg " + korAvg + " " + engAvg);

        sc.close();
    }
}






