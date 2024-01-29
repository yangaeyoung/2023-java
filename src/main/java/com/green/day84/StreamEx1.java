package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = {55, 10, 2, 22, 80, 90, 33};
        Integer[] integerArr = {55, 10, 2, 22, 80, 90, 33};
        // 배열을 stream으로
//        Stream<Integer> stream1 = Arrays.stream(intArr).boxed(); boxed():  primitive 타입을 wrapper 타입으로 박싱하여 반환
        Stream<Integer> stream1 = IntStream.of(intArr).boxed();
        Stream<Integer> stream2 = Stream.of(integerArr);
//        Stream1 = stream2.sorted().limit(3);


        List<Integer> list = stream1.sorted()
                .limit(3) // 중간 연산
                .collect(Collectors.toList()); // 최종 연산
//        stream을 이용해 정렬(sorted) list로 만들어주는 작업(collect), limit는 그 자리수만큼 자르기, 순서 상관有
//        stream1.forEach(item -> System.out.println(item)); -> list로 한 번 연산했기 때문에 사라져서 다시 연산 불가 -> 다시 하고 싶다면 다시 만들어야 함


        IntStream.of(intArr).boxed() // stream 만듦
                .sorted() // 중간 연산
                .limit(4) // 중간 연산
                .forEach(item -> System.out.print(item + ", ")); // 최종 연산


        System.out.println();
        System.out.println(list);
        System.out.println(Arrays.toString(intArr));
    }
}
