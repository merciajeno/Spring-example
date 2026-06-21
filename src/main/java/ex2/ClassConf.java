package ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("ex2")
public class ClassConf {

	 @Bean
	  public Parrot parrot() {
	    Parrot p = new Parrot();
	    p.setName("Koko");
	    return p;
	  }
	 
	 @Bean
	 @Primary
	  public Parrot parrot1() {
	    Parrot p = new Parrot();
	    p.setName("Spooky");
	    return p;
	  }
	 
//	  @Bean
//	  public Person person() {
//	    Person p = new Person();
//	    p.setName("Ella");
//	    //p.setParrot(parrot());//takes from the context if exists else creates new instance
//	    return p;
//	  }
	
}
