package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        // MyConn에 있는 getConn 메소드 호출하고 메소드가 리턴하는 값 담기
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country_id, country)" + "VALUES (110, '경현 나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnTest2{
    public static void main(String[] args) {
        //title: 처음 작성
        //ctnts: 처음 작성하는 내용입니다.
        //wirter: 홍길동
        BoardEntity entity = new BoardEntity();
        entity.setTitle("오늘 insert 배움");
        entity.setCtnts("java를 통해 board테이블 값 넣어봄");
        entity.setWrite("신난다");
        BoardDao.insBoardDao(entity);// 클래스명.메소드명(매개변수): 대문자, static
    }
}