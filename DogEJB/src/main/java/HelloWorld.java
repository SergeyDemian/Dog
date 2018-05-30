package main.java;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class HelloWorld
 */
@Stateless (
		mappedName = "HelloWorld"
		)
@TransactionManagement(TransactionManagementType.BEAN)
public class HelloWorld implements HelloWorldRemote, HelloWorldLocal {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello!";
	}

}
