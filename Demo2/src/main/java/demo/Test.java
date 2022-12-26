package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test 
{
	@Id			//to make id as PK
	private int id;
	private String Name;
	private double percentage;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	

}
