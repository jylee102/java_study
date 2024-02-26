package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl; // 자동타입변환
        ia.methodA();
//        ia.methodB();
//        ia.methodC();

        InterfaceB ib = impl;
        ib.methodB();
//        ib.methodA();
//        ib.methodC();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
