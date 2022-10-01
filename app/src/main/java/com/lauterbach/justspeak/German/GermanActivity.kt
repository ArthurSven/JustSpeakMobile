package com.lauterbach.justspeak.German

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.ActivityGermanBinding
import com.lauterbach.justspeak.databinding.ActivityMainBinding

class GermanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGermanBinding
    private lateinit var paragraphs : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGermanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val layoutManager = LinearLayoutManager(applicationContext)
    }
}