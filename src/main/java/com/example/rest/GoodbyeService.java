package com.example.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/goodbye")
public class GoodbyeService {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayGoodbye() {
        return "Goodbye, RESTEasy!";
    }
}
