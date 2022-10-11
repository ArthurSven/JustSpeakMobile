package com.lauterbach.justspeak.German.GermanGrammar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.ActivityAdjectivesGermanBinding

class GermanAdjectives : AppCompatActivity() {

    private lateinit var binding: ActivityAdjectivesGermanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdjectivesGermanBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}