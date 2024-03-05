package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    // 객체의 주소를 비교할 때 사용
    @Override
    public boolean equals(Object obj) {
        // Object obj = new Member()인가?
        if (obj instanceof Member target) {
            if (id.equals(target.id)) return true;
        }
        return false;
    }
}
