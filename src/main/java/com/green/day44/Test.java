package com.green.day44;

public class Test {
    public static void main(String[] args) {
        //체이닝 기법
        MyInfo mi = new MyInfo()
                .title("ddd") //setter타입(title)
                .description("인스타 클론 코딩");

//        setter기법
//        mi.title("ggg");
//        mi.description("zzz");
        System.out.println(mi);

        MyOpenApi moa = new MyOpenApi().info(mi);
        System.out.println(moa);
    }
}
