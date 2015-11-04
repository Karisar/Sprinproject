package com.sarsila.springproject.model;

import java.util.List;

public interface GreetingDAO {
	public void save(Greeting greeting);
	public List fetchAll();
}
