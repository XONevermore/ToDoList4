package com.example.sardor.todolist;

public class Info {
    private String title;
    private String about;

    public Info(String title, String about){
        this.title = title;
        this.about = about;
    }

    String getTitle(){
        return title;
    }
    String getAbout(){
        return about;
    }
}
