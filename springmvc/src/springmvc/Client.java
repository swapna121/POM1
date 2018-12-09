package springmvc;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Employee eref=new Employee();
		eref.setEid(101);
		eref.setAddress("Kolkata");
		eref.setEname("CRISTIANO");
		System.out.println("details:  " +eref);
	}
	
	Resource resource=new ClassPathResource("swapna.xml");
	

}
