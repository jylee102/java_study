package ch13.sec03.exam01;

public class GenericExample {
    // 제네릭 메소드
    // 리턴타입에 제네릭 들어가 있다면 그 앞에 제너릭 써줘야 함
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        Box<String> box2 = boxing("홍길동");

        System.out.println(box1.getT());
        System.out.println(box2.getT());
    }
}
