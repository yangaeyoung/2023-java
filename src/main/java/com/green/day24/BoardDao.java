package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;//import + 클래스의 풀네임
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Data access object
public class BoardDao {
    public static int insBoardDao(BoardEntity entity) {//title, ctnts, writer에 값이 들어 있음
        int result = 0;
        String sql = "INSERT INTO board (title, ctnts, writer)" +
                "VALUES" +
                "(?, ?, ?)";// ? 쓸 수 있는 이유: preparedstatement
//          String sql = "INSERT INTO board " + // 띄어쓰기 해야 함541028568210452304520451457186752'. -이주영 作
//                       "SET tile = ?" +
//                       ", ctnts = ?" +
//                       ", writer = ?";
//        String sql = String.format("INSERT INTO board (title, ctnts, writer)" +
//                "values ('%s', '%s', '%s')", entity.getTitle(), entity.getCtnts(), entity.getWrite());

        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());//string이기 때문에 ?에 자동으로 ' ' 붙여줌
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWrite());

            result = ps.executeUpdate();//영향을 받은 레코드 수를 int로 받음
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM board where iboard = ?";
        int result = 0;
        try {
            con = MyConn.getConn();// con에 값을 넣지 않으면 null point 에러 발생
            ps = con.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int updBoard(BoardEntity entity) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE board" +
                " SET TITLE = ?" +
                ", CTNTS = ?" +
                ", WRITER = ?" +
                ", UPDATED_AT = NOW()" +
                " WHERE IBOARD = ?";
        int result = 0;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWrite());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {// 검색, 페이징 처리할 때 파라미터 사용할 예정
        //List<BoardEntity> 사용 이유: BoardEntity의 전역변수에 값을 담기 위해
        List<BoardEntity> list = new ArrayList();// 파라미터 미지정: 모든 것을 쓰겠다는 뜻 //DB의 레코드를 한 줄씩 저장할 공간
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at " +
                "FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {//레코드가 있는 수만큼 반복되고 false로 멈춤  if문은 한 줄만 // 레코드를 가리킴
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWrite(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);//add로 값을 넣어 둔 후 이후에 값을 빼서 사용하기 위해서
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;//return은 한 번만 할 수 있기 때문에 새 객체 list를 만들고 list에 모든 값을 다 담음
    }

    public static BoardEntity selBoardId(int iboard) {
        BoardEntity entity = new BoardEntity();//리턴타입을 맞추기 위해 새 객체 생성
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * from board where iboard = ?";
        try {
            conn = MyConn.getConn();//데이터 베이스 연결
            ps = conn.prepareStatement(sql);//sql문장으로 객체 생성
            ps.setInt(1, iboard);//sql문에 있는 ? 값 넣기
            rs = ps.executeQuery();// 실행, 데이터 전송
            if (rs.next()) {// 한 레코드만 출력할 예정이기 때문에 while문 대신 if문 사용
//                int iboard1 = rs.getInt("iboard");
//                String title = rs.getString("title");
//                String ctnts = rs.getString("ctnts");
//                String writer = rs.getString("writer");
//                String createdAt = rs.getString("created_at");
//                String updatedAt = rs.getString("updated_at");
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));//"컬럼명"
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWrite(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);// 리소스 낭비가 심해서 닫아 주는 게 좋음
        }
        return entity;
    }
}
