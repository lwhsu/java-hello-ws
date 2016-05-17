package org.lwhsu.test.hello_ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.lwhsu.test.hello.Hello;

@Path("hello")
public class HelloHandler {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return Hello.hello() + " Hello, " + name;
    }

}
