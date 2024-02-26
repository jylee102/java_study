package ch08.sec04;

public interface RemoteControl {
    // 상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // default 인스턴스 메소드 작성
    // 음소거 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME); // 볼륨을 0으로 바꿈
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    //static메소드 작성
    // public 생략됨 컴파일 과정에서 자동으로 붙는다
    // 접근제한자 private 가능
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다");
    }
}
