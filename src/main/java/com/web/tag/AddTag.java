package com.web.tag;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * <my:add x="10.5" y="20" />
 * <my:add x="10.5" y="20" z="30.5" />
 * @author boddy
 */

public class AddTag extends SimpleTagSupport implements DynamicAttributes{
    private Map<String , Double> map = new LinkedHashMap<>();

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        double sum = 0.0;
        sum = map.entrySet().stream().mapToDouble(t -> t.getValue()).sum();
        out.print("總和: " + sum);
    }
    
    @Override
    public void setDynamicAttribute(String string, String string1, Object o) throws JspException {
        map.put(string1, Double.parseDouble(o + " "));
    }
    
}
