package SerializationDeserialization;

import java.io.Serializable;

public class Planet implements Serializable{

	private String name;
	private String mass;
	
	public Planet(String name, String mass) {
		super();
		this.name = name;
		this.mass = mass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}
	
	
}
