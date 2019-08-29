package sessions.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/sessions")
public class SessionMng {
	
	@Context
	private HttpServletRequest request;

	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String start() {
		HttpSession session=request.getSession(true);
		session.setAttribute("total",0);
	    return "session is started, total = 0";
	  }
	
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  @Path("/add")
	  public String addNum(@QueryParam("num") int num) {
		//add num to clients session
		HttpSession session=request.getSession(false);
		Integer curr=(Integer)session.getAttribute("total");
		curr+=num;
		session.setAttribute("total",curr);
		return "total = "+curr;
	  }
	
}
