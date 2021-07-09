package com.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

/**
 *
 * @author boddy
 */

public class SearchTag implements BodyTag{
    private PageContext pageContext;
    private BodyContent bodyContent;
    private Tag parentTag;
    private String key;

    public void setKey(String key) {
        this.key = key;
    }
       
    @Override
    public void setBodyContent(BodyContent b) {
        bodyContent = b;
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
        return BodyTag.EVAL_BODY_BUFFERED;
    }
    
    @Override
    public void doInitBody() throws JspException {
    }

    @Override
    public int doAfterBody() throws JspException {
        // 取得標籤內的資料
        String content = bodyContent.getString();
        String html = String.format("<font color='%s'>%s</font>", "red" , key);
        String new_content = content.replace(key, html);
        JspWriter out = bodyContent.getEnclosingWriter();    //要從 bodyContent 那裡取得
        try {
            out.print(new_content);
        } catch (Exception e) {
        }
        return Tag.SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return Tag.EVAL_PAGE;
    }

    @Override
    public void release() {
    }
    
}
