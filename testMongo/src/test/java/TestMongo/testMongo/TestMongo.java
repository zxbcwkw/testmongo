package TestMongo.testMongo;


import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestMongo {
	public static void main( String[] args ) {
	    // Replace the uri string with your MongoDB deployment's connection string
	    String uri = "mongodb://127.0.0.1:27017";
	    try (MongoClient mongoClient = MongoClients.create(uri)) {
	        MongoDatabase database = mongoClient.getDatabase("test");
	        MongoCollection<Document> collection = database.getCollection("test");
	        Document doc = collection.find().first();
	        System.out.println(doc.toJson());
	    }
	}

}
