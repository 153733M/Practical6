package demo;


import com.google.gson.Gson;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class Book {
    String title;
    String description;
    String author;
    int year;


    public Book() {
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;
    }

    @Produces(MediaType.APPLICATION_JSON)
    public String getResource(){


        Book book = new Book();

        Gson gson = new Gson();
        String json = gson.toJson(book);

        return json;
    }
}