package com.web.controller;

import com.web.service.CalcAreaService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/CalcArea2") // url-pattern
public class CalcAreaServlet2 extends HttpServlet {
    
    // 計算 service
    private CalcAreaService service = new CalcAreaService();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {               
        // 1. 接收多組參數(多重複名稱)
        String[] types = req.getParameterValues("type");
        String[] rs    = req.getParameterValues("r");
        
        // 2. 商業邏輯運算
        List<Map> list = service.getAreaResults(types, rs);
        
        // 3. 建立分派器與 jsp 位置
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/calcAreaResult2.jsp");
        
        // 3.1 新增/設定 request 屬性, 傳遞給 jsp 頁面使用
        req.setAttribute("list", list);
        
        // 3.2 傳送
        rd.forward(req, resp);

    }
    
}
