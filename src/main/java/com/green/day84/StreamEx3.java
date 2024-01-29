package com.green.day84;

import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0, item -> item + 2)
                .mapToInt(Integer::valueOf)
//                .mapToInt(item -> {return Integer.valueOf(item);});
                .skip(3) // 앞에서 3개 값 넘어감
                .limit(10)
                .boxed()
//                .forEach(System.out::println) // 가공 X
                .forEach(item -> System.out.print(item + ", "));
        // return 0 + 2
        // return 2 + 2
        // return 4 + 2
        // return 6 + 2
    }
}
