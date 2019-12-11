package com.abdullah.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.abdullah.coderswag.Adapters.CategoryAdapter
import com.abdullah.coderswag.Model.Category
import com.abdullah.coderswag.R
import com.abdullah.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var adapter: CategoryAdapter

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.Categories)

        categoryListView.adapter = adapter
    }
}
