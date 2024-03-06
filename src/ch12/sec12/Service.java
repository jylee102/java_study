package ch12.sec12;

import java.lang.annotation.Annotation;

public class Service {
    @PrintAnnotation
    public void method1() {
    }

    @PrintAnnotation("*")
    public void method2() {
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
    }
}
