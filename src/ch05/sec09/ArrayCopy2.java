package ch05.sec09;

public class ArrayCopy2 {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        // System.arraycopy(원본배열, 원본배열 인덱스(복사 시작 지점), 새배열, 새배열 인덱스(붙여넣기 시작 지점), 복사할 배열의 갯수);
        System.arraycopy(oldStrArray, 0, newStrArray, 0, 3);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
        }
    }
}
