package ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private String name;
	
	@Autowired
	private Parrot parrot;
	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name = string;
	}
	public String getName()
	{
		return this.name;
	}
	public Parrot getParrot()
	{
		return this.parrot;
	}
	public void setParrot(Parrot parrot2) {
		// TODO Auto-generated method stub
		this.parrot = parrot2;
	}
}
