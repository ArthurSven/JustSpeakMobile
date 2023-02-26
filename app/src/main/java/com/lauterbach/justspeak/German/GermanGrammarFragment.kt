package com.lauterbach.justspeak.German

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.card.MaterialCardView
import com.lauterbach.justspeak.German.GermanGrammar.*
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.FragmentGermanGrammarBinding
import com.lauterbach.justspeak.databinding.FragmentGermanHomeBinding


open class GermanGrammarFragment : Fragment() {

    lateinit var binding: FragmentGermanGrammarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGermanGrammarBinding.inflate(layoutInflater)

        binding.GermanAlphabetCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanAlphabet::class.java)
            startActivity(intent)
        }
        binding.GermanAdjectivesCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanAdjectives::class.java)
            startActivity(intent)
        }
        binding.GermanCasesCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanCases::class.java)
            startActivity(intent)
        }
        binding.GermanNounsCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanNouns::class.java)
            startActivity(intent)
        }
        binding.GermanNumbersCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanNumbers::class.java)
            startActivity(intent)
        }
        binding.GermanPronounsCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanPronouns::class.java)
            startActivity(intent)
        }
        binding.GermanSentenceCard.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(), GermanSentences::class.java)
            startActivity(intent)
        }
        return binding.root

    }
    /*fun buttonClick(karte: MaterialCardView, activ: Activity) {
        karte.setOnClickListener {
            val intent = Intent(this@GermanGrammarFragment.requireContext(),activ::class.java)
            startActivity(intent)
        }
    } */

}