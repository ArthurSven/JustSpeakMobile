package com.lauterbach.justspeak.German.GermanGrammar

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.ActivityAlphabetGermanBinding
import com.lauterbach.justspeak.databinding.ActivityGermanBinding

class GermanAlphabet : AppCompatActivity() {

    lateinit var binding: ActivityAlphabetGermanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlphabetGermanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}