package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello Mercia");
//		 var context = 
//			       new AnnotationConfigApplicationContext(); 
		AnnotationConfigApplicationContext context =
		        new AnnotationConfigApplicationContext(ProjectConfig.class);
        //System.out.println(context.getApplicationName());
		Parrot p = context.getBean(Parrot.class);
		//System.out.println(context.containsBean("parrot"));
		System.out.println(p);
		
	}
}
