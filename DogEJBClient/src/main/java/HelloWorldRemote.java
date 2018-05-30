package main.java;

import java.io.Serializable;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote extends Serializable{

	public String getMessage();
}
