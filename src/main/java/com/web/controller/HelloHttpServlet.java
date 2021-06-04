package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author boddy
 */

public class HelloHttpServlet extends HttpServlet{
    
    // 從網址送過來的，所以做 doGet 方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.

        String name = req.getParameter("name");
        
        
        System.out.printf("Hello %s %s\n" , name , new Date());   
        PrintWriter out = resp.getWriter();   
        out.print("Hello:");    
        out.print(name);
        out.print(" " + new Date());
        //out.close();
    }
    
}
