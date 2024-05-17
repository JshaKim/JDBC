package com.ohgiraffers.section01.statement;

import com.ohgiraffers.common.JDBCTemplate;

import java.sql.Connection;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.*;

public class Application01 {

    public static void main(String[] args) {

        Connection con = JDBCTemplate.getConnection();
        // 쿼리문 저장하고 실행하는 용도의 기능적 인터페이스
        Statement stmt = null;

    }
}
