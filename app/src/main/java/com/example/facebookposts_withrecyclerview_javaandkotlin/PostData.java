package com.example.facebookposts_withrecyclerview_javaandkotlin;

public class PostData {
    String account_name;
    int hours_counter;
    String post_text;
    String post_link;
    int likes_count;
    int share_count ;
    int image_id;

    public PostData(String account_name, int hours_counter, String post_text, String post_link, int image_id, int likes_count, int share_count) {
        this.account_name = account_name;
        this.hours_counter = hours_counter;
        this.post_text = post_text;
        this.post_link = post_link;
        this.image_id = image_id;
        this.likes_count = likes_count;
        this.share_count = share_count;
    }
}
