package com.web.tag;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

/**
 * 假如我要做這樣子的 Tag:
 * 
    <my:hello />
    晚安 現在時刻:...

 * @author boddy
 */

public class HelloTag implements Tag{
    private PageContext pageContext;
    private Tag parentTag;
    
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
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH");
            String df = sdf.format(d);
            int h = Integer.parseInt(df);
            
            if (h >= 6 && h < 12) {
                out.print("早安 ");
            } else if (h >= 12 && h < 18) {
                out.print("午安 ");
            } else {
                out.print("晚安 ");
            }
                     
        } catch (Exception e) {
        }
        return Tag.SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print("現在時刻: " + new Date());
        } catch (Exception e) {
        }
        return Tag.EVAL_PAGE;
    }

    @Override
    public void release() {
        
    }
    
}
