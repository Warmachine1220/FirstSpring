package com.sortalgo.FirstSpring.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class someCDIbusinessDAO {

	@Inject
	someCDUbusiness someCDIDAO;

	public someCDUbusiness getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO() {
		this.someCDIDAO = someCDIDAO;
	}

}
