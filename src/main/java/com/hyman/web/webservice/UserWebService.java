package com.hyman.web.webservice;


import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hyman.web.bean.User;



@Path("/user")
@Api(tags = {"userWebService"})
public interface UserWebService {

	@Path("/find")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="find user by username",tags = {"find"})
    public User find(@ApiParam @QueryParam("username") String username);
	
	@Path("/findById")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="find user by id",tags = {"findById"})
    public User findById(@ApiParam @QueryParam("id") int id);
	
	
	@Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="list all the users",tags = {"list"})
    public List<User> list();
	
	@Path("/update")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="update the user",tags = {"update"})
	public boolean update(@ApiParam @QueryParam("username")String username,
			@ApiParam @QueryParam("password")String password);
}
