package com.example.smart_farm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Props>
    lateinit var imageID: Array<Int>
    lateinit var headding: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageID = arrayOf(
        //images for properties of plant health
        )
        headding = arrayOf(
        //status information
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.LayoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Props>()
        getUserData()

        private fun getUserData(){
            for(i in imageID.indices){
                val props = Props(imageID[i],headding[i])
                newArrayList.add(props)
            }
            newRecyclerView.adapter = Adapter(newArrayList)
        }


    }
}