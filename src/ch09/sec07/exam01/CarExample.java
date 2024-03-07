package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run1();
        myCar.run2();
        myCar.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("타이어가 굴러갑니다.");
            }
        });
    }
}
