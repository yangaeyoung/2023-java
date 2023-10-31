package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Data access object
public class BoardDao {
    public static int insBoardDao(BoardEntity entity) {//title, ctnts, writer에 값이 들어 있음
        int result = 0;
        String sql = "INSERT INTO board (title, ctnts, writer)" +
                        "VALUES" +
                        "(?, ?, ?)";

        System.out.println(sql);

        try {
            Connection con = MyConn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWrite());



            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }
}
