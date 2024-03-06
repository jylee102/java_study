package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        // 제네릭: 아직 정해지지 않은 타입에 대해 그때그때 다르게 정의 가능
        Box<String> box = new Box</* String */>();
        box.content = "안녕하세요.";
        String content = box.content;

        Box<Integer> box2 = new Box<>(); // 제네릭은 primitive 타입으로 정의될 수 없고 포장 클래스를 사용해야 한다.
        box2.content = 4;
        int content2 = box2.content;

        /*
        box.content = "문자열";
        box.content = 1; // Integer타입
        box.content = new Bottle();

        String content = (String) box.content;
        System.out.println(content);
         */
    }
}
