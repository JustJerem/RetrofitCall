package com.jeremieguillot.retrofitcall.presentation.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.jeremieguillot.retrofitcall.R
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels

@AndroidEntryPoint
class ListActivity : AppCompatActivity() {

    private val viewModel: ListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getHistoricalEvents()
        viewModel.events.observe(this, { list ->
            val allNames = list.map { it.title }.joinToString("\n")
            updateNames(allNames)
        })
    }

    private fun updateNames(allNames: String) {
        val textView = findViewById<TextView>(R.id.tx_flights)
        textView.text = allNames
    }
}