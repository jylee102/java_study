package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("apple", "아이폰");

        System.out.println(myPhone);
        System.out.println(myPhone.toString());
    }
}
