package com.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

/**
 * <my:lotto count="5">  可以取出 5 個 1~100 (亂數)彩球號碼
 * @author boddy
 */

public class LottoTag implements IterationTag{
    private PageContext pageContext;
    private Tag parentTag;
    private Integer count;

    public void setCount(Integer count) {
        this.count = count;
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
        return Tag.EVAL_BODY_INCLUDE;
    }
    
    @Override
    public int doAfterBody() throws JspException {
        -- count;
        if (count == 0) {
            return Tag.SKIP_BODY;
        }
        return IterationTag.EVAL_BODY_AGAIN;
    }

    @Override
    public int doEndTag() throws JspException {
        return Tag.EVAL_PAGE;
    }

    @Override
    public void release() {
    }
    
}
