    package com.abdullah.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdullah.coderswag.R
import com.abdullah.coderswag.Utilities.EXTRA_CATEGORY

    class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
