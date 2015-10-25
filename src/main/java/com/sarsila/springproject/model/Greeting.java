package com.sarsila.springproject.model;

import java.util.ArrayList;
import java.util.List;

public class Greeting {

    private long id;
    private String content;
    private List lista;
    
    public List getLista() {
		return lista;
	}

	public Greeting() {
		lista = new ArrayList();
		lista.add(new String("eka"));
    	lista.add(new String("toka"));
    	lista.add(new String("kolmas"));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}