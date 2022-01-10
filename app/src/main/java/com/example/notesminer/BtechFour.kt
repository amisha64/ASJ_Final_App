package com.example.notesminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.notesminer.databinding.ActivityBtechFourBinding

class BtechFour : AppCompatActivity() {

    private  lateinit var newRecyclerView: RecyclerView
//    private lateinit var newArrayList: MutableList<BtechOneItem>
    private val sub = Datasource().subOne()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBtechFourBinding.inflate(layoutInflater)
        setContentView(binding.root)

        newRecyclerView = binding.btechone

        newRecyclerView.adapter = AdapterOne(this,sub)
//        AdapterOne(this,sub).setOnItemClickListener(object :AdapterOne.onItemClickListener{
//            override fun onItemClick(position: Int) {
//                Toast.makeText(this@BtechOne,"You Clicked on item no. $position", Toast.LENGTH_SHORT).show()
//            }
//
//
//        })
        newRecyclerView.setHasFixedSize(true)
//        newArrayList = mutableListOf()
//        getUserData()
//
//    }
//
//    private fun getUserData() {
//        for (i in sub.indices){
//            val subjects = sub[i]
//            newArrayList.add(subjects)
//        }
//
//        newRecyclerView.adapter = AdapterOne(newArrayList)
    }
}