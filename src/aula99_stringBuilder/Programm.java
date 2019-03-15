package aula99_stringBuilder;

public class Programm {
	
	public static void main(String[] args) {
		
		Post post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		
		post1.addComment(c1);
		post1.addComment(c2);
		
		System.out.println(post1);
		
	}

}
