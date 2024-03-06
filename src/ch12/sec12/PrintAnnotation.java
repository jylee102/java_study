package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 정의
@Target({ElementType.METHOD}) // 메소드에서만 해당 어노테이션을 사용할 수 있도록 지정
@Retention(RetentionPolicy.RUNTIME) // 실행 중 계속 어노테이션 정보(어떻게 처리해야 할지)를 유지한다.
public @interface PrintAnnotation {
    String value() default "-";

    int number() default 15;
}
