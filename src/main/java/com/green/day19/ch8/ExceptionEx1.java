package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
//        num = num / 0;//에러 발생으로 실행 X
        try {//혹시나 예외가 발생된다면
            num = 10;
            num = num / 0;
        } catch (Exception e) {//예외 발생 됐을 때 실행
            e.printStackTrace();//어떤 에러인지 확인시
            System.out.println("예외 발생");
            num = -1;
        } finally {//없어도 됨 //반드시 실행 됨
            System.out.println("finally 실행");
        }
        System.out.println("num : " + num);
        System.out.println("--끝--");
    }
}

class ExceptionEx1_2{
    public static void main(String[] args) {
        div(20);
    }
    public static void div(int num){
        try {
            num = 10;
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생");
            num = -1;
        } finally {// return을 만나도 에러가 터져도 finally만은 실행됨
            num += 1;
            System.out.println("finally 실행");
        }
        System.out.println("num : " + num);
        System.out.println("--끝--");
    }
}


class ExceptionEx1_3{
    public void sum(){ }
    public static void main(String[] args) {
        try{
            int[] arr = new int[10];
            arr[10] = 10;
//            ExceptionEx1_3 obj = null;
//            obj.sum();
            //int num = 10 / 0;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("수학적 예외");
        }catch (NullPointerException e){
            System.out.println("널포인트 예외");
        }catch (Exception e){
            System.out.println("모든 예외");
        }
        System.out.println("끝!!!");
    }
}