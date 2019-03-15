package aula99_stringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private List<Comment> comments;

	private String title;
	private String content;
	private int likes;
	private String moment;
	
	public Post() {
		comments = new ArrayList<>();
	}
	
	public Post(String title, String content, int likes) {
		this();
		this.title = title;
		this.content = content;
		this.likes = likes;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss.SSS");
		this.moment = sdf.format(new Date());
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getMoment() {
		return moment;
	}
	public void setMoment(String moment) {
		this.moment = moment;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitle() + "\n");
		sb.append(this.getLikes() + " Likes - " + this.getMoment() + "\n");
		sb.append(this.getContent() + "\n");
		sb.append("Comments: \n" );
		for(Comment c: this.getComments()) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}

}
