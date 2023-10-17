package com.green.day14.ch6;

public class Document {
    String name;
    static int i = 0;//static으로 고정시켜놓고 ++i를 하면 1,2,3으로 증가

    Document() {// this String 타입으로 11번 Document(String name)으로 넘어감 name 복사되고 4번 줄의 name에 들어가고 13번 name으로 출력
        this("제목없음" + ++i);
    }

    Document(String name) {
        this.name = name;
        System.out.printf("문서 %s가 생성되었습니다.\n", this.name);
    }
}


class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();//문서 제목 없음1 가 생성되었습니다.
        Document d2 = new Document("자바.txt"); //문서 자바.txt가 생성되었습니다.
        Document d3 = new Document();//문서 제목 없음2 가 생성되었습니다.
        Document d4 = new Document();//문서 제목 없음3 가 생성되었습니다.
        Document d5 = new Document();//문서 제목 없음4 가 생성되었습니다.
    }
}
