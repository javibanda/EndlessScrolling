package com.example.endlessscrolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.endlessscrolling.adapter.strings.ListStringsRecyclerAdapter

class MainActivity : AppCompatActivity() {

    private var page = 1

    private lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler)

        Log.d(":::", getList().toString())
        initRecycler()
    }

    private fun initRecycler(){
        val stringAdapter = ListStringsRecyclerAdapter(getList())
        recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = stringAdapter
        }
    }

    private fun getList(): MutableList<String>{
        val numberList: MutableList<String> = ArrayList()
        for (i in 1..50){
            numberList.add(i.toString())
        }
        return numberList
    }
}