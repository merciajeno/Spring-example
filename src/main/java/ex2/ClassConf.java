package ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ex2")
public class ClassConf {

//	 @Bean
//	  public Parrot parrot() {
//	    Parrot p = new Parrot();
//	    p.setName("Koko");
//	    return p;
//	  }
//	 
//	  @Bean
//	  public Person person() {
//	    Person p = new Person();
//	    p.setName("Ella");
//	    //p.setParrot(parrot());//takes from the context if exists else creates new instance
//	    return p;
//	  }
	
}
