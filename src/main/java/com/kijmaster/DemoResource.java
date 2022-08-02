package com.kijmaster;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.mongodb.assertions.Assertions;

@Path("/demo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource
{

    @GET
    @Path("/test")
    public Response test() {

        Assertions.assertTrue(Data.findAll()
                .count() == 0);

        return Response.ok()
                .build();
    }
}
