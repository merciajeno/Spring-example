package ex1;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Parrot {

	private String name;

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	
	@PostConstruct
	public void generate()
	{
		
		    System.out.println("Murder Queen!!");
	}
	
	@Override
	public String toString() {
	    return "Parrot{name='" + name + "'}";
	}
}
