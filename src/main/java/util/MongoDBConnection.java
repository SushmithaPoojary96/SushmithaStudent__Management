package util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    public static MongoDatabase getDatabase() {

        MongoClient client = MongoClients.create("mongodb://localhost:27017");

        System.out.println("MongoDB Connected Successfully");

        return client.getDatabase("studentdb");
    }
}