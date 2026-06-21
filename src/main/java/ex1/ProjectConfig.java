package ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("ex1")
public class ProjectConfig {

	@Bean                        
	Parrot parrot() {
	Parrot p = new Parrot();
	p.setName("Koko");         
	return p;    
	}
	
//	@Bean
//	@Primary
//	Parrot parrot1()
//	{
//		Parrot p1 = new Parrot();
//		p1.setName("Merry");
//		return p1;
//	}
	
	@Bean                  
	  String hello() {
	    return "Hello";
	  }
	 
	  @Bean                  
	  Integer ten() {
	    return 10;
	  }

}
