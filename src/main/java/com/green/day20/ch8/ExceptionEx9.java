package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e= new Exception("일부러 에러 터트림");
            System.out.println("ddd");
            throw e;//예외 발생
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("끝");
    }
}
