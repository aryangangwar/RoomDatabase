package com.example.roomapp.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.roomapp.R
import com.example.roomapp.data.User
import kotlinx.android.synthetic.main.customrow.view.*

class listAdapter : RecyclerView.Adapter<listAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listAdapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.customrow,parent,false))
    }

    override fun onBindViewHolder(holder: listAdapter.MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.tv_id.text = currentItem.id.toString()
        holder.itemView.tv_firseName.text = currentItem.firstName
        holder.itemView.tv_LastName.text = currentItem.lastName
        holder.itemView.tv_age.text = currentItem.age.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(user : List<User>){
        this.userList = user
        notifyDataSetChanged()
    }
}