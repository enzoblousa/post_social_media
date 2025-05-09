package Entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date; 
public class Post {
    Date moment;
    String title;
    String content;
    Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    //metodo para add comentario na lista
    public void addComent(Comment comment){
        comments.add(comment);
    }
    //metodo para remover comentario na lista
    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        return "likes = " +likes; 
    }
    
    
}
