package ch03.sec07;

public class LogicalOperator {
    public static void main(String[] args) {
        int charCode = 'A'; // 자동타입변환: 65

        // 65 ~ 90 (대문자 알파벳 유니코드)
        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자이군요");
        }

        // 97 ~ 122 (소문자 알파벳 유니코드)
        if ((97 <= charCode) & (charCode <= 122)) {
            System.out.println("소문자이군요");
        }

        // 48 ~ 57 (숫자 유니코드)
        if ((48 <= charCode) & (charCode <= 57)) {
            System.out.println("0-9 사이의 숫자이군요");
        }

        System.out.println("--------------------");

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }

        if ((value % 8 == 0) | (value % 9 == 0)) {
            System.out.println("8 또는 9의 배수");
        }
    }
}
