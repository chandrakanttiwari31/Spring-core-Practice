package withoutXml;


import org.springframework.stereotype.Component;

@Component("mystudent")
public class Student {
	
	public void  study()
	{
		System.out.println("Student are studying together");
	}
	
	

}
