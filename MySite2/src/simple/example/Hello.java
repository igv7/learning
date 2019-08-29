package simple.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//test on :   http://localhost:8080/RESTful/rest/hello   (/rest/ url pattern defined in web.xml)
@Path("/hello")
public class Hello {

// This method is called if TEXT_PLAIN is request
@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayPlainTextHello() {
//	  List<String> d=Arrays.asList("aaa","ddd");
//	  d.stream().forEach(c->System.out.println(c));
 return "Hello Jersey";
}

// This method is called if XML is request
@GET
@Produces(MediaType.TEXT_XML)
public String sayXMLHello() {
 return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
}

// This method is called if HTML is request
@GET
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHello() {
 return "<html> " + "<title>" + "Hello Jersey" + "</title>"
     + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
}

@GET
@Path("/person")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Person getPerson(){
	  Person p=new Person();
	  p.setName("David");
	  p.setAge(20);
	  return p;
}

@GET
@Path("/greet/{name}")
public String greet(@PathParam("name") String name){
	  return "Hello "+name+" !!!";
}

}
