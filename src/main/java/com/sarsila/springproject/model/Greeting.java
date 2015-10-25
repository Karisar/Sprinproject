package com.sarsila.springproject.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import com.mongodb.Block;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Sorts.ascending;
import static java.util.Arrays.asList;


public class Greeting {

    private long id;
    private String content;
    private List lista;
    
    public List getLista() {
		return lista;
	}

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
    
    public void SaveNew()
    {
    	// kariuser, karipwd
    	String userName="kariuser";
    	String password="karipwd";
    	String database="karitestmongodb";
    
      	MongoClient mongoClient = new MongoClient(
  			  new MongoClientURI( "mongodb://kariuser:karipwd@ds045664.mongolab.com:45664/karitestmongodb" )
  			);
  	MongoDatabase db = mongoClient.getDatabase(database);
        
    	db.getCollection("greetings").insertOne(
    	        new Document("greeting", id)
    	                .append("id", id)
    	                .append("content", content));
    }
    
    public void getAll()
    {
       	// kariuser, karipwd
    	String userName="kariuser";
    	String password="karipwd";
    	String database="karitestmongodb";
    
    	MongoClient mongoClient = new MongoClient(
    			  new MongoClientURI( "mongodb://kariuser:karipwd@ds045664.mongolab.com:45664/karitestmongodb" )
    			);
    	MongoDatabase db = mongoClient.getDatabase(database);
    	FindIterable<Document> iterable = db.getCollection("greetings").find();
    	lista = new ArrayList();
    	
    	iterable.forEach(new Block<Document>() {
    	    @Override
    	    public void apply(final Document document) {   	        
    			lista.add(new String(document.toString()));
    	    }
    	});

	
    }

}