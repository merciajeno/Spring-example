package ex2;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

	public Parrot() {
		this.name = "Spooky";
		System.out.println("Parrot created");
		}
	private String name;
	 @Override
	  public String toString() {
	    return "Parrot : " + name+this.hashCode();
	  }
	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name = string;
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
	
