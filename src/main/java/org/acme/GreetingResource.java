package org.acme;

import java.math.BigInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/api/v1/calculatefactorial")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public BigInteger hello(@PathParam("id") int id) {
        BigInteger factorial = BigInteger.ONE; 
        Long timenow = System.currentTimeMillis();
        for (int i = id; i > 0; i--) {
             factorial = factorial.multiply(BigInteger.valueOf(i)); 
             //System.out.println("Hi");
            }
        Long timeafter = System.currentTimeMillis(); 
        System.out.println("Elapsed Time : "+ (timeafter-timenow)/1000);           
        return factorial;
    }

}