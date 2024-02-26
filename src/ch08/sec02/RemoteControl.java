package ch08.sec02;

public interface RemoteControl {
    // 필드 상수 선언
    int MAX_VOLUME = 10; // public static final이 생략됨
    int MIN_VOLUME = 0;

    // 추상메소드
    public void turnOn(); // abstract가 생략됨
}
