package com.sortalgo.FirstSpring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

	@Autowired
	JDBCConnection JDBCConnection;

	public JDBCConnection getJDBCConnection() {
		return JDBCConnection;
	}

	public void setJDBCConnection(JDBCConnection jDBCConnection) {
		this.JDBCConnection = jDBCConnection;
	}

}
