package com.johnbryce.SpringApp7BootMVC2.rest;


import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.johnbryce.SpringApp7BootMVC2.beans.Person;

@RestController
public class MyController {
	
	@Autowired
	public List<Person> people;
	
	@PostConstruct
	public void peopleList() {
		Person person = new Person();
		person.setName("Kobi");
		person.setAge(31);
		people.add(person);
		
		Person person2 = new Person();
		person2.setName("Igor");
		person2.setAge(36);
		people.add(person2);
		
	}
	
	@GetMapping(value="/greet")
	public String sayHello(@RequestParam(name="name") String name) {
		return "Hello " + name;
	}
	
	
	@GetMapping(value="/sum/{num1}/{num2}")
	public String getSumOfNumbers(@PathVariable(name="num1") int a, @PathVariable(name="num2") int b) {
		return (a+b)+"";
	}
	
	
//	@GetMapping(value="/people")
//	public List<Person> getPeople() {
//		return people;
//	}
	
	
	@PostMapping(value="/handle", consumes="application/json")
	public Person handleOnePerson(@RequestBody Person p){
        p.setName(p.getName()+" (handled....)");
        return p;
    }
	
	
//	@PostMapping(value="/handle2", consumes="application/json")
//	public List<Person> handlePerson(@RequestBody Person p) {
//		people.add(p);
//		return people;
//	}
	
	
	@RequestMapping("/person/{name}/{age}")
	public ResponseEntity<?> getPerson(@PathVariable("name") String name, @PathVariable("age") int age) {
		if(age < 1 || age > 120) {
			return new ResponseEntity<String>("Wrong age value! Try again", HttpStatus.BAD_REQUEST);
		}
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	
//	@PutMapping(value="/handle3", consumes="application/json")
//	public List<Person> handlePutPerson(@RequestBody Person p) {
//		System.out.println("start");
//		System.out.println(people);
//		for(int i=0;i<people.size();i++) {
//			if(people.get(i).getName().equals(p.getName())) {
//				people.get(i).setAge(p.getAge());
//			}
//		}
//		System.out.println("end");
//		System.out.println(people);
//		return people;
//	}
//	
//	
//	@DeleteMapping(value="/delete/{name}")
//	public List<Person> handleDeletePerson(@PathVariable("name") String name) {
//		System.out.println("start");
//		System.out.println(people);
//		for(int i=0;i<people.size();i++) {
//			if(people.get(i).getName().equals(name)) {
//				people.remove(i);
//			}
//		}
//		System.out.println("end");
//		System.out.println(people);
//		return people;
//	}
	
	
	
	
	
	
	//*******************************Home Work CRUD***************************************
	//GET
	//http://localhost:8080/getAllPeople
	@GetMapping(value="/getAllPeople")
	public List<Person> getPeople() {
		return people;
	}
	
	//Postman    POST   http://localhost:8080/addPerson   Body=>raw=>JSON(aplication/json)
	@PostMapping(value="/addPerson", consumes="application/json")
	public List<Person> handlePerson(@RequestBody Person p) {
		people.add(p);
		return people;
	}
	
	//Postman    PUT   http://localhost:8080/updatePerson   Body=>raw=>JSON(aplication/json)
	@PutMapping(value="/updatePerson", consumes="application/json")
	public List<Person> handlePutPerson(@RequestBody Person p) {
		for(int i=0; i<people.size(); i++) {
			if(people.get(i).getName().equals(p.getName())) {
				people.get(i).setAge(p.getAge());
			}
		}
		return people;
	}
	
	//Postman    DELETE   http://localhost:8080/delete/Moshe
	@DeleteMapping(value="/delete/{name}")
	public List<Person> handleDeletePerson(@PathVariable("name") String name) {
		for(int i=0; i<people.size(); i++) {
			if(people.get(i).getName().equals(name)) {
				people.remove(i);
			}
		}
		return people;
	}

}
