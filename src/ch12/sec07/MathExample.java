package ch12.sec07;

public class MathExample {
    public static void main(String[] args) {
        double v1 = Math.ceil(5.3); // (천장으로) 올림
        double v2 = Math.floor(5.3); // (바닥으로) 버림
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        long v3 = Math.max(3, 7); // 최대값
        long v4 = Math.min(3, 7); // 최소값
        System.out.println("v3: " + v3);
        System.out.println("v4: " + v4);

        // 소수 이하 두 자리 얻기
        // 100을 곱하고 반올림한 후 100을 다시 나눔
        // 세 자리를 얻는 경우에는 1000을 곱했다가 나누면 됨
        double value = 12.3456;
        double temp1 = value * 100; // 1234.56
        long temp2 = Math.round(temp1); // 1235
        System.out.println(temp2);

        double v5 = temp2 / 100.0;
        System.out.println(v5);
    }
}
