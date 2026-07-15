package ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    CommentService bean = context.getBean(CommentService.class);
	System.out.println(bean);
	System.out.println(bean.getClass());
	}

}
