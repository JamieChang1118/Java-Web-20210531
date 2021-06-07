package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 利用 @ 配置 Servlet
 * @author boddy
 */

// http://localhost:8080/JavaWeb20210531/HelloNewServlet
// http://localhost:8080/JavaWeb20210531/xxx/yyy/zzz
// http://localhost:8080/JavaWeb20210531/hello.asp
// http://localhost:8080/JavaWeb20210531/anyword/任意字串
@WebServlet(name = "HelloNewServlet" , urlPatterns = {"/HelloNewServlet","/xxx/yyy/zzz","/hello.asp","/anyword/*"})
public class HelloNewServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("HelloNewServlet " + new Date());
    }
    
}
