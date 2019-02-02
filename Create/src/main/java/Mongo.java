import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.kls.bean.User;
import com.kls.connection.MongoFactory;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient; 
public class Mongo {

	static String str="name";
	static String str1="pass";
	static String str2="mobile";
	static String  str3="email";
	 static List list = new ArrayList();
     
	public static void main(String args[])
	{
		try
	
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	MongoDatabase db = mongoClient.getDatabase("at");
	            MongoCollection collection = db.getCollection("people");
 //FindIterable<Document> docs = collection.find();
//	            for(Document doc:docs) {   
//	            	User user = new User();
//	                user.setId((ObjectId) doc.get("_id"));
//	                user.setName(doc.get("name").toString());
//	                user.setPass(doc.get("pass").toString());
//	                user.setMobileNumber(doc.get("mobileNumber").toString());
//	                 user.setEmail(doc.get("email").toString());            
	            DBObject document1 = new BasicDBObject();
 document1.put("name", "name");
 document1.put("pass", "pass");
 document1.put("mobile Number","number");
 document1.put("email","email");
collection.insertOne(document1);	        
 System.out.println("Inserted");
	              }
catch(Exception e)
	{
		System.out.println("Exception"+e);
	}
		
	
}
}
