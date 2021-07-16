package com.web.rest;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * 我的 Rest 應用程式的根
 * @author boddy
 */

@ApplicationPath("/rest")
public class MyRestApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        // 註冊 Rest service
        Set<Class<?>> classes = new LinkedHashSet();
        classes.add(HelloService.class);
        classes.add(BmiService.class);
        classes.add(BookService.class);
        return super.getClasses();
        
    }
      
}
