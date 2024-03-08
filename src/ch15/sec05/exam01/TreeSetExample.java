package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>(); // 이진트리 구조 형태

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 정렬된 Integer객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();

        // 특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));

        System.out.println();

        // 내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();

        // 범위검색(80 <= )
        // tailSet(fromElement, inclusive): 주어진 객체보다 높은 객체를 가지고 온다.
        // 두 번째 매개변수는 해당 객체를 포함하고 싶으면 true
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 범위검색(80 <= score < 90)
        // subSet(fromElement, fromInclusive, toElement, toInclusive): 시작과 끝으로 주어진 사이의 객체들을 구한다.
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 범위검색(87 >= )
        // headSet(toElement, toInclusive): 주어진 객체보다 낮은 객체들을 가지고 온다.
        rangeSet = scores.headSet(87, true);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }
    }
}
