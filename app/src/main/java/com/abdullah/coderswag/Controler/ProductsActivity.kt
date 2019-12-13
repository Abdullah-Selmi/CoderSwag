    package com.abdullah.coderswag.Controler

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.abdullah.coderswag.Adapters.ProductAdapter
import com.abdullah.coderswag.R
import com.abdullah.coderswag.Services.DataService
import com.abdullah.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

    class ProductsActivity : AppCompatActivity() {

        lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(categoryType))

        var spamCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spamCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720) {
            spamCount = 3
        }

        val layoutManager = GridLayoutManager(this, spamCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
