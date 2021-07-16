package com.web.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * 
 * @author boddy
 */

@Path("/hello")
public class HelloService {
    
    // Client: /JavaWeb20210531/rest/hello/john
    @Path("/john")
    @GET
    @Produces("text/plain")     // 回傳的格式:存文字
    public String helloJohn(){
        return "Hello John !";
    }
    
    // Client: /JavaWeb20210531/rest/hello/1
    // Client: /JavaWeb20210531/rest/hello/2?score=100
    @Path("/{id}")
    @GET
    @Produces("text/plain")
    public String helloId(@PathParam("id") Integer id , @QueryParam("score") Integer score){     // Integer id 會去抓 @PathParam("id") 的參數
        return "Hello id = " + id + " score = " + score;
    }
}
