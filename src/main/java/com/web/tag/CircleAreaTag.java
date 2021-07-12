package com.web.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * <my:circleArea r="10" mode="1" />
 * <my:circleArea r="10" mode="2" />
 * @author boddy
 */

public class CircleAreaTag extends SimpleTagSupport{
    private double r;
    private int mode = 1;

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        double result = 0.0;
        switch(mode){
            case 1:
                result = Math.pow(r, 2) * Math.PI;
                break;
            case 2:
                result = Math.pow(r, 3)* 4/3 * Math.PI;
                break;
            default:
        }
        
        out.print(String.format("r: %.1f mode: %d area:%.2f", r , mode , result));
    }
      
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }
    
    
}
