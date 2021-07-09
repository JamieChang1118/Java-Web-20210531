package com.web.tag;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;


/**
 * 假如我要做這樣子的 Tag:
 * 
    <my:welcome >
        歡迎 XXX 的光臨 <%=new Date() %>
    <my:welcome />
     
   OUTPUT:
   * 
   歡迎 John 的光臨
   現在時刻: 2021/07/09 18:46:25

 * @author boddy
 */

public class WelcomeTag implements Tag{
    private PageContext pageContext;
    private Tag parentTag;
    private String username;    // 自定義的屬性

    public void setUsername(String username) {
        this.username = username;
    }
      
    @Override
    public void setPageContext(PageContext pc) {
        pageContext = pc;
    }

    @Override
    public void setParent(Tag t) {
        parentTag = t;
    }

    @Override
    public Tag getParent() {
        return parentTag;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.println("歡迎 " + username + " 的光臨");
        } catch (Exception e) {
        }
        return Tag.EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        return Tag.EVAL_PAGE;
    }

    @Override
    public void release() {
    }
    
}
