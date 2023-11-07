package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
        entity.setTitle("오늘 약속 있음");
        entity.setCtnts("섀도 좀 발라봄");
        entity.setWrite("어쩌라고");
        BoardDao.insBoardDao(entity);// 클래스명.static메소드(매개변수): 대문자, static
    }
}

class MyConnTest3{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(2);
        int row = BoardDao.delBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest4{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(3);
        entity.setTitle("수정 제목");
        entity.setCtnts("수정 내용");
        entity.setWrite("수정자");

        int row = BoardDao.updBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest5{
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();//프론트에게 전달하기 위해 selBoardList 형태로 list에 값 담기
        for (BoardEntity entity : list) {
            System.out.println(entity.toString());// 오버라이딩
        }
    }
}

class MyConnTest6{
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardId(4);
        System.out.println(result);
    }
}