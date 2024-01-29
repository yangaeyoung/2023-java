package com.green.day84;

import java.io.File;
import java.util.stream.Stream;

// 책 Ex2
public class StreamEx4 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"), new File("Ex1.bak")
                , new File("Ex1.java"), new File("Ex2")
                , new File("Ex2.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr);
        Stream<String> strStream = fileStream.map(item -> item.getName()); // fileArr 하나씩 대입되는데 getName은 "" 안에 들어 있는 문자만 들어오게 됨
        strStream.forEach(System.out::println);

        System.out.println("------------------------");
//        Stream.of(fileArr).map(File::getName); // map(File::getName) == map(item -> item.getName())
        Stream.of(fileArr).map(File::getName) // getName으로 String 타입이 됨
                .filter(item -> item.indexOf(".") != -1) // 마음에 들지 않으면 솎아 낼 수 있기 때문에 개수가 줄어들 수 있음, indexOf 특정 문자열을 찾음
                .map(item -> item.substring(item.indexOf('.') + 1)) // 문자열 자르기
                .map(item -> item.toUpperCase()) // 대문자로 변환
                .distinct()
                .forEach(System.out::println)
        ;
        System.out.println("------------------------");

        System.out.println("12345".indexOf('.'));
        System.out.println("123.45".indexOf('.'));
        System.out.println(".12345".indexOf('.'));
    }
}
