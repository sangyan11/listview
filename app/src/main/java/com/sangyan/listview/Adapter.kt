package com.sangyan.listview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(val context : Activity,val list :ArrayList<User> ) : ArrayAdapter<User> (context,R.layout.layout_item,list){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item,null)
        val user_name : TextView
        val user_age : TextView
         user_name = view.findViewById(R.id.name)
         user_age = view.findViewById(R.id.age)
        user_name.text = list[position].name
        user_age.text = list[position].age.toString()

        return  view
    }

}