package com.web.filter;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * 自己寫 Respones，取代原生的 Respones
 * @author boddy
 */

public class MyResponse extends HttpServletResponseWrapper{
    private PrintWriter out;
    private CharArrayWriter bufferArrayWriter;
    
    public MyResponse(HttpServletResponse response) {
        super(response);
        bufferArrayWriter = new CharArrayWriter();
        out = new PrintWriter(bufferArrayWriter);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return out;
    }
    
    public String getHTMLString(){
        return bufferArrayWriter.toString();
    }
    
}
