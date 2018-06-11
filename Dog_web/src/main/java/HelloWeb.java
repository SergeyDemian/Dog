package main.java;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean (
		name = "helloWorld"
		)
public class HelloWeb implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB(lookup = "java:global/Dog_EAR/DogEJB/HelloWorld!main.java.HelloWorldLocal")
	HelloWorld hello;
	
	private String helloW = hello.getMessage();

	public String getHelloW() {
		return helloW;
	}

	public void setHelloW(String helloW) {
		this.helloW = helloW;
	}
	
	
}
