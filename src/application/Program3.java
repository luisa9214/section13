package application;

import entitie.Comment;
import entitie.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program3 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "traveling to new zeland", "i'm going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}

