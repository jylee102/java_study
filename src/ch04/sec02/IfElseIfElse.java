package ch04.sec02;

public class IfElseIfElse {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A");
        } else if (score >= 80) {
            System.out.println("점수가 80점 이상입니다.");
            System.out.println("등급은 B");
        } else if (score >= 70) {
            System.out.println("점수가 70점 이상입니다.");
            System.out.println("등급은 C");
        } else {
            System.out.println("점수가 70점 미만입니다.");
            System.out.println("등급은 D");
        }
    }
}
