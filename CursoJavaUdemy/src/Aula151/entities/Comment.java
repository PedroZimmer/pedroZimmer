package Aula151.entities;

import java.util.Date;



public class Comment {

    private String text;

    public Comment(){
    }

    public Comment(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String toString(){
        return text;
    }




}


