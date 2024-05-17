package com.ohgiraffers.section02.template;

import java.sql.Connection;

public class Application01 {
    public static void main(String[] args) {
        Connection con = JDBCTemplate.getConnection(); // 리펙터링(소스코드 중복을 막아주는 것 / 코드를 깔끔하게 정리하는 것)
        System.out.println("con : " + con);

        JDBCTemplate.close(con);
        System.out.println("con : " + con);

    }
}
