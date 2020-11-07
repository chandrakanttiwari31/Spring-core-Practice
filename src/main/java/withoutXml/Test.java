package withoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stu=context.getBean("mystudent",Student.class);
		System.out.println(stu);
		stu.study();

	}

}
