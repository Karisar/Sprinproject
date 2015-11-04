package com.sarsila.springproject.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class GreetingMongoDaoImpl implements GreetingDAO {

	@Override
	public void save(Greeting greeting) {
		// TODO Auto-generated method stub
    	String database="karitestmongodb";
    
      	MongoClient mongoClient = new MongoClient(
  			  new MongoClientURI( "mongodb://kariuser:karipwd@ds045664.mongolab.com:45664/karitestmongodb" )
  			);
      	MongoDatabase db = mongoClient.getDatabase(database);
        
      	db.getCollection("greetings").insertOne(
    	        new Document("greeting", greeting.getId())
    	                .append("content", greeting.getContent()));

	}

	@Override
	public List fetchAll() {
       	// kariuser, karipwd
    	String userName="kariuser";
    	String password="karipwd";
    	String database="karitestmongodb";
    
    	MongoClient mongoClient = new MongoClient(
    			  new MongoClientURI( "mongodb://kariuser:karipwd@ds045664.mongolab.com:45664/karitestmongodb" )
    			);
    	MongoDatabase db = mongoClient.getDatabase(database);
    	FindIterable<Document> iterable = db.getCollection("greetings").find();
    	final ArrayList lista = new ArrayList();
    	
    	iterable.forEach(new Block<Document>() {
    	    @Override
    	    public void apply(final Document document) {   	        
    			lista.add(new String(document.getString("content")));
    	    }
    	});
    	return lista;
	}
}
