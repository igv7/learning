package person;
public class Person implements Food, Health {
	private long id;
	private String name;
	private String last;
	private float age;
	
	public Person(long id, String name, String last, float age) {
		this.id = id;
		this.name = name;
		this.last = last;
		this.age = age;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public float getAge() {
		return age;
	}


	public void setAge(float age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", last=" + last + ", age=" + age + "]";
	}


	@Override
	public int longLive() {
		// TODO Auto-generated method stub
		return 120;
	}


	@Override
	public String whatsForDinner() {
		// TODO Auto-generated method stub
		return "Pizza";
	}
	
	
	
	
	
}