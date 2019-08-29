package jaxb.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class TodoService {

	@GET
	@Path("/greet/{user}")
	public String greet(@PathParam("user") String name) {
		return "Hello " + name;
	}

	@GET
	@Path("sum")
	public String sum(@QueryParam("num1") int x, @QueryParam("num2") int y) {
		return (x + y) + "";
	}

	// This method is called if XMLis request
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Todo getIt1() {
		Todo todo = new Todo();
		todo.setSummary("This is my first todo");
		todo.setDescription("This is my first todo");
		return todo;
	}

	// This can be used to test the integration with the browser
	@GET
	@Produces({ MediaType.TEXT_XML })
	public Todo getIt2() {
		Todo todo = new Todo();
		todo.setSummary("This is my first todo");
		todo.setDescription("This is my first todo");
		return todo;
	}

	@GET
	@Path("json")
	@Produces({ MediaType.APPLICATION_JSON })
	public Todo getIt3() {
		Todo todo = new Todo();
		todo.setSummary("This is my first todo ***");
		todo.setDescription("This is my first todo !!!!");
		return todo;
	}

	@GET
	@Path("all")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Todo> getAll() {
		List<Todo> td = new ArrayList<Todo>();
		Todo todo1 = new Todo();
		todo1.setSummary("first sum");
		todo1.setDescription("first desc");
		Todo todo2 = new Todo();
		todo2.setSummary("second sum");
		todo2.setDescription("second desc");
		Todo todo3 = new Todo();
		todo3.setSummary("3rd sum");
		todo3.setDescription("3rd desc");
		td.add(todo1);
		td.add(todo2);
		td.add(todo3);
		return td;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("add")
	public Todo setToDo(Todo todo) {
		System.out.println(todo.getSummary() + " - " + todo.getDescription());
		todo.setSummary(todo.getSummary() + " Handled by server...");
		return todo;
	}
}
