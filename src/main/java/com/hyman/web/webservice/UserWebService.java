package com.hyman.web.webservice;


import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hyman.web.bean.User;



@Path("/user")
public interface UserWebService {

	@Path("/find")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User find(@QueryParam("username") String username);
}
