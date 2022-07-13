package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initialize data
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = binding.recyclerView

        recyclerView.adapter = ItemAdapter(this,myDataset)

        //Use this setting to improve performance if you know that changes in context
        // do not change the layout size of the recycler view
        recyclerView.setHasFixedSize(true)

    }
}