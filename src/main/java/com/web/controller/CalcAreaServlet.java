package com.web.controller;

import com.web.service.CalcAreaService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 主要要接取前端 String r 的內容
 * @author boddy
 */
@WebServlet("/controller/CalcArea")  // url-pattern
public class CalcAreaServlet extends HttpServlet{
    
    // 計算 service
    private CalcAreaService service = new CalcAreaService();

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().print("Sorry~");    // 如果Client端使用Get請求，則會顯示Sorry
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 接收參數
        String string_type = req.getParameter("type");
        String string_r = req.getParameter("r");
        int type = Integer.parseInt(string_type);
        int r = Integer.parseInt(string_r);
        
        // 2. 商業邏輯運算
        double area = service.getAreaResult(type, r);
        String typeName = service.getNameByType(type);
//        int r = Integer.parseInt(string_r);
//        double area = Math.pow(r, 2)*Math.PI;
        
        // 3. 建立分派器和設定 jsp 的位置
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/calcAreaResult.jsp");
        // 3.1 新增 request 屬性
        req.setAttribute("result", String.format("%.2f", area));   // 可以設定多組屬性給 jsp 頁面使用
        req.setAttribute("r", r);
        req.setAttribute("type", type);
        req.setAttribute("typeName", typeName);
        // 3.2 傳送
        rd.forward(req, resp);       
        //resp.getWriter().print(String.format("r: %d area: %.2f", r , area));  //不要直接回應給前端
        
    }
    
}
