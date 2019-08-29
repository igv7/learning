package spring;

public class Dog {
	
	private String name;
	private int weight;
	private Chip chip;
	
	public Dog() {
		
	}

	public Dog(String name, int weight, Chip chip) {
		super();
		this.name = name;
		this.weight = weight;
		this.chip = chip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}
	
	

}
