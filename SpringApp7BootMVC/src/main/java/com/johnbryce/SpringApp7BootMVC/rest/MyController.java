package com.johnbryce.SpringApp7BootMVC.rest;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnbryce.SpringApp7BootMVC.beans.Person;

@RestController
public class MyController {
	@Autowired
    private Collection<Person> people;
     
    @PostConstruct
    public void init() {
        Person p=new Person();
        p.setName("David");
        p.setAge(20);
        people.add(p);
        Person p2=new Person();
        p2.setName("Ann");
        p2.setAge(30);
        people.add(p2);
    }

     
//  http://localhost:8080/greet?name=yaakov
    //@GET
  //@GetMapping
    @RequestMapping(value="/greet", method=RequestMethod.GET)
    @CrossOrigin
    public String greet(@RequestParam(value= "name",defaultValue="No One")String name){
        return "Hello "+name+" !!!";
    }
     
//	http://localhost:8080/sum/5/4
    @GetMapping("/sum/{num1}/{num2}")
    @CrossOrigin
    public String sum(@PathVariable int num1,@PathVariable int num2){
        return num1+num2+"";
    }
     
     
   
//	http://localhost:8080/people
    @RequestMapping("/people")
    @CrossOrigin
    public Collection<Person> getPeople(){
        return people;
    }
     
//	localhost:8080/handle
    //@POST
  //@RequestMapping(value="/handle", consumes="application/json", method=RequestMethod.POST)
    @PostMapping(value="/handle", consumes="application/json")
    @CrossOrigin
    public Person handlePerson(@RequestBody Person p){
        p.setName(p.getName()+" (handled....)");
        return p;
    }
    
    @RequestMapping(value="/handle2", consumes="application/json", method=RequestMethod.POST)
    public Collection<Person> addPerson (@RequestBody Person p) {
    	people.add(p);
		return people;
    }
    
//    //PUT
//    @RequestMapping(value="/update", consumes="application/json", method=RequestMethod.PUT)
//    @CrossOrigin
//    public Person updatePerson(@RequestBody Person p) {
//    	p.setName(p.getName() + " (updated....)");
//    	p.setAge(p.getAge());
//		return p;
//    }
//    
//    //DELETE
//    @RequestMapping(value="/delete", method=RequestMethod.DELETE)
//    @CrossOrigin
//    public Person deletePerson(@RequestBody Person p) {
//    	
//		return p;
//    }
    
    @RequestMapping("/person/{name}/{age}")
    public ResponseEntity<?> getPerson(@PathVariable("name")String name,@PathVariable("age") int age){
        if(age<0||age>120){
            return new ResponseEntity<String>("wrong age value...",HttpStatus.BAD_REQUEST);
        }
        Person p=new Person();
        p.setName(name);
        p.setAge(age);
        return new ResponseEntity<Person>(p,HttpStatus.OK);
    }
}
