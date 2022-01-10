package com.example.notesminer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterOne(private val context: Context,
                 private val subList: List<BtechFourItem>):RecyclerView.Adapter<AdapterOne.MyViewHolderOne>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderOne {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.btech_four_list_item, parent,false)
        return MyViewHolderOne(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolderOne, position: Int) {
        val currentItem = subList[position]
        holder.subname.text=context.resources.getString(currentItem.sub)
    }

    override fun getItemCount(): Int {
        return subList.size
    }

    class MyViewHolderOne(itemView: View):RecyclerView.ViewHolder(itemView){
        var subname : TextView = itemView.findViewById(R.id.textViewsub)
    }
}