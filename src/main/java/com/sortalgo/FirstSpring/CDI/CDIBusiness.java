package com.sortalgo.FirstSpring.CDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDIBusiness {




	public static void main(String[] args) {
		ApplicationContext Appcont = new AnnotationConfigApplicationContext(CDIBusiness.class);// .run(CDIBusiness.class,
																								// args);

		someCDIbusinessDAO dao1 = Appcont.getBean(someCDIbusinessDAO.class);

		System.out.println(dao1);


	}

}
