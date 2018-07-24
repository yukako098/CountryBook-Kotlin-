package com.example.yuka.countrybook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val countryName = intent.getStringExtra("name")

        val titleTV = findViewById<TextView>(R.id.country_name)
        titleTV.setText(countryName)

        val descriptionTV = findViewById<TextView>(R.id.county_description)
        descriptionTV.setText("")

    }
}
