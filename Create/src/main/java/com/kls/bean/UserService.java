package com.kls.bean;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.kls.connection.*;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class UserService {
	
	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	MongoDatabase db = mongoClient.getDatabase("at");
            MongoCollection coll = db.getCollection("people");
	public List getAll() {
		System.out.println("Start");
        
        List list = new ArrayList();
       
        
        FindIterable<Document> docs = coll.find();
        for(Document doc:docs) {   
        	 User user = new User();
          
             user.setId((ObjectId) doc.get("_id"));
             user.setName(doc.get("name").toString());
             user.setPass(doc.get("pass").toString());
             user.setMobileNumber(doc.get("mobileNumber").toString());
              user.setEmail(doc.get("email").toString());  
              System.out.println(user.getName());
            list.add(user);
        }
        return list;
    }
	 public Boolean delete(String id) {
	        boolean output = false;
	        try {
	        	coll.deleteOne(new Document("_id", new ObjectId(id)));
	            output = true;          
	        } catch (Exception e) {
	            output = false;
	        }   
	        return output;
	    }
	 public Boolean update(User user) {
	        boolean output = false;
	        try {
	    
	            BasicDBObject edited = new BasicDBObject();
	            edited.put("id", user.getId()); 
	            edited.put("name", user.getName());
	            edited.put("pass", user.getName());
	            edited.put("mobileNumber", user.getName());
	            edited.put("email", user.getName());
	             
	            coll.update(existing, edited);
	            output = true;
	        } catch (Exception e) {
	            output = false;
	            
	        }
	        return output;
	    }
	 
	 

}
