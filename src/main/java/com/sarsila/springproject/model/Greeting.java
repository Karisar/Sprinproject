package com.sarsila.springproject.model;

// Muutettu pelkäksi POJOksi, Tietokantatoteutukset omissa daoimpleissään
public class Greeting {

    private long id;
    private String content;
    
	public Greeting() {
		
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