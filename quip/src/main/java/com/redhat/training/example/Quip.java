package com.redhat.training.example;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/")
public class Quip {

@GET
@Produces("text/plain")
public Response index() throws Exception {
    return Response.ok("I came, I saw, I conquered...\n").build();
  }

@GET
@Path("/ready")
@Produces("text/plain")
public Response ready() throws Exception {
    return Response.ok("OK\n").build();
  }

}

