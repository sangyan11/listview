package com.sangyan.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = ArrayList<User>()
        item.add(User("Sangyan",22))
        item.add(User("Ajay",21))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Vikas",22))
        item.add(User("Sangyan",22))
        item.add(User("Anuj",23))
        item.add(User("Anuj",23))
        item.add(User("Anuj",23))
        item.add(User("Anuj",23))
        item.add(User("Anuj",23))
        item.add(User("Anuj",23))
        item.add(User("Anuj",23))
        item.add(User("Sangy",25))
        item.add(User("Sangyan",22))
        
    val adapter = Adapter(this,item)
        listview.adapter = adapter
    }
}