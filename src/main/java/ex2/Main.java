package ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConf.class);
		//System.out.println(context.containsBean("person")); returns true if bean is present
		//System.out.println(context.containsBean("parrot"));
		 Person person = 
				 context.getBean(Person.class);              
				 
				 Parrot parrot = 
				 context.getBean(Parrot.class);              
				 System.out.println(
				 "Person's name: " + person.getName());      
				 System.out.println(
				 "Parrot's name: " + parrot);      
				 System.out.println(
				 "Person's parrot: " + person.getParrot()); 
	}
}
