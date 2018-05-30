package main.java;

import java.io.Serializable;

import javax.ejb.Local;

@Local
public interface HelloWorldLocal extends Serializable {

	public String getMessage();
}
