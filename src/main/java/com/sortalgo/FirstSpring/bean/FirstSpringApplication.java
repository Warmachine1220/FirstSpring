package com.sortalgo.FirstSpring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	private static Logger Logger = LoggerFactory.getLogger(FirstSpringApplication.class);

	public static void main(String[] args) {
		ApplicationContext Appcont = SpringApplication.run(FirstSpringApplication.class, args);

		PersonDAO persondao = Appcont.getBean(PersonDAO.class);
		PersonDAO persondao1 = Appcont.getBean(PersonDAO.class);

		Logger.info("{}", persondao);
		Logger.info("{}", persondao.getJDBCConnection());

		Logger.info("{}", persondao1);
		Logger.info("{}", persondao1.getJDBCConnection());


	}

}
