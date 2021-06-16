package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Exemplo3Aula13 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		String titlePost1 = "Traveling to New Zealand";
		String contentPost1 = "I'm going to visit this wonderful country!";
		Date moment1 = new Date();
		moment1 = sdf1.parse("21/06/2018 13:05:44");
		int likesPost1 = 12;
		
		String titlePost2 = "Good night guys";
		String contentPost2 = "See you tomorrow";
		Date moment2 = new Date();
		moment2 = sdf1.parse("28/07/2018 23:14:19");
		int likesPost2 = 5;
		
		Post post1 = new Post(moment1, titlePost1, contentPost1, likesPost1);
		Post post2 = new Post(moment2, titlePost2, contentPost2, likesPost2);
		
		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome");
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the Force be with you");
		
		post1.addComment(comment1);
		post1.addComment(comment2);
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post1);
		System.out.println(post2);
		
	}

}
