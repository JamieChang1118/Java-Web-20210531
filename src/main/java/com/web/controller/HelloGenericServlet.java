package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 我的第一支 Servlet
 * @author boddy
 */

public class HelloGenericServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // req 表示收到前端(client)來的請求資訊。  例如: http://localhost:8080/.../...?name=John
        String name = req.getParameter("name");
        
        
        // res 表示要回應給前端(client)的內容
        System.out.printf("Hi %s %s\n" , name , new Date());   // 印在 Server 的 console 中 (通常用於 debug 或開發上觀察變數使用)，並不會回應給前端
        PrintWriter out = res.getWriter();    // 透過 out 可以將訊息回傳給 client
        out.print("Hi:");    // 把訊息寫在 HTTP Response 文件的 Part 4 
        out.print(name);
        out.print(" " + new Date());
        //out.close();
    }
    
}