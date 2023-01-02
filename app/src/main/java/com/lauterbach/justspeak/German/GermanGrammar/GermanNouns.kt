package com.lauterbach.justspeak.German.GermanGrammar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.justspeak.German.GermanGrammar.Nouns.GermanBodyNoun
import com.lauterbach.justspeak.German.GermanGrammar.Nouns.GermanFoodNoun
import com.lauterbach.justspeak.German.GermanGrammar.Nouns.GermanPeopleNouns
import com.lauterbach.justspeak.German.GermanGrammar.Nouns.GermanPlaceNoun
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.ActivityNounsGermanBinding

class GermanNouns : AppCompatActivity() {

    lateinit var binding: ActivityNounsGermanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNounsGermanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.germanpeoplenoun.setOnClickListener {
            Intent(this, GermanPeopleNouns::class.java).also {
                startActivity(it)
            }
        }
        binding.germanplacenoun.setOnClickListener {
            Intent(this, GermanPlaceNoun::class.java).also {
                startActivity(it)
            }
        }
        binding.germanfoodnoun.setOnClickListener {
            Intent(this, GermanFoodNoun::class.java).also {
                startActivity(it)
            }
        }
        binding.germanhumannoun.setOnClickListener {
            Intent(this, GermanBodyNoun::class.java).also {
                startActivity(it)
            }
        }
    }
}
