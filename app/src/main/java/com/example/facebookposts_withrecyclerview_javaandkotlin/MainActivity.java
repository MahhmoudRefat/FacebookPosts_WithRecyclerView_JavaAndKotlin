package com.example.facebookposts_withrecyclerview_javaandkotlin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView PostsRecycler;
    postsRecyclerAdapter adapter;
    List<PostData> postList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PostsRecycler = findViewById(R.id.rv_posts);

        postList = new ArrayList<>(4);
        postList.add(new PostData("Mahmoud Refaat",3,"I get about 80 a week right now. I can not see why! This is being caused from loads of all ","http://unblast.com/color-schemes",R.drawable.imagepost3,20,15));
        postList.add(new PostData("Moahmed Refaat",6,"Buckle up , because change is coming to WordPress","http://unblast.com/color-schemes",R.drawable.post_photo,20,15));
        postList.add(new PostData("Abdelrahman Refaat",10,"Ah dang I do have some resources in /drawable-mdpi and others just in /drawable. I've been running this on a 1.6 emulator for some time though","http://unblast.com/color-schemes",R.drawable.imagepost3,30,8));
        postList.add(new PostData("ahmed Refaat",20,"When you build the application R.java contains all the memory address and it happens that those address are invalid for next run","http://unblast.com/color-schemes",R.drawable.post_photo,70,9));

        adapter = new postsRecyclerAdapter(postList);
        PostsRecycler.setAdapter(adapter);


    }


}