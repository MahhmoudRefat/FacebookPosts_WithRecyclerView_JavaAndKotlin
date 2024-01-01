package com.example.facebookposts_withrecyclerview_javaandkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.facebookposts_withrecyclerview_javaandkotlin.databinding.ActivityMainByKotlinBinding

class MainActivity_by_kotlin : AppCompatActivity() {
    private lateinit var binding:ActivityMainByKotlinBinding
    lateinit var adapter: PostsAdapter_Kt
    lateinit var ContactList: MutableList<PostData_Kt>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_by_kotlin)
        binding = ActivityMainByKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    private fun initRecyclerView() {
        createContactList();
        adapter = PostsAdapter_Kt(ContactList)
        binding.rvPosts.adapter =adapter
    }

    private fun createContactList() {
        ContactList = arrayListOf()
        for (i in 0..10) {
            ContactList.add(PostData_Kt("Mahmoud Refaat",4,"I get about 80 a week right now. I can not see why! This is being caused from loads of all ","http://unblast.com/color-schemes",5,10,R.drawable.post_photo));
            ContactList.add(PostData_Kt("ahmed Refaat",4,"Buckle up , because change is coming to WordPress ","http://unblast.com/color-schemes",30,25,R.drawable.imagepost3));
            ContactList.add(PostData_Kt("mohamed Refaat",4,"When you build the application R.java contains all the memory address and it happens that those address are invalid for next run","http://unblast.com/color-schemes",5,10,R.drawable.post_photo));

        }
    }
}