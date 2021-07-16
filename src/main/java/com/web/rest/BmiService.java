package com.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author boddy
 */

@Path("/bmi")
public class BmiService {
    
    // Client: /JavaWeb20210531/rest/bmi/170/60
    @Path("/{h}/{w}")
    @GET
    @Produces(MediaType.TEXT_PLAIN) // 就等於 --> "text/plain"
    public String bmi(@PathParam("h") Double h , @PathParam("w") Double w){
        double bmi = w / Math.pow(h/100.0, 2);
        return String.format("BMI = %.2f", bmi);
    }
    
    // Client: /JavaWeb20210531/rest/bmi?h=170&w=60
    @Path("/")    
    @GET
    @Produces("text/plain")
    public String bmi2(@QueryParam("h") Double h , @QueryParam("w") Double w){
        double bmi = w / Math.pow(h/100.0, 2);
        return String.format("BMI = %.2f", bmi);
    }
    
    
}
