package com.hyman.web.webservice;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Api(tags = {"testWebService"})
public interface TestWebService {

	@Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="Test example",tags = {"TestWebService.test"})
    public String test(@ApiParam @QueryParam("arg") String arg);
	
}
