package com.rizkyarifnur.dicodingandroidbeginner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.rizkyarifnur.dicodingandroidbeginner.adapter.TourismRecyclerAdapterOnclick
import com.rizkyarifnur.dicodingandroidbeginner.model.TourismData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_tourism.layoutManager = LinearLayoutManager(this)
        val items = TourismData(this.resources).getContents()
        val adapter = TourismRecyclerAdapterOnclick{
            item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtras(Bundle().fromTourismModel(item))
            startActivity(intent)
        }
        adapter.setItem(items)
        rv_tourism.adapter = adapter

    }
}
