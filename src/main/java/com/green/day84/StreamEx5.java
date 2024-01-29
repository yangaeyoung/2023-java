package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

// 책 826? 쪽 참고
public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(new Integer[]{100, 1, 8, 10, 22});
//        intList.stream() // Integer을 int로 변경 해줘야 sum을 할 수 있어서 mapToInt로 int 타입으로 만들기
//                .mapToInt(item -> item).sum();
        int sum = intList.stream().mapToInt(item -> item).sum();
        System.out.println("sum: " + sum);

        OptionalDouble avg = intList.stream().mapToInt(item -> item).average(); // OptionalDouble: null이 들어가지 않음
        if(avg.isPresent()){ // null check
            System.out.println("avg: " + avg.getAsDouble());
        }
        double avg2 = Optional.ofNullable(avg).map(item -> item.getAsDouble()).orElse(0.0);
        System.out.println("avg2: " + avg2);
    }
}
