package ex2;

public class Parrot {

	public Parrot() {
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
	
