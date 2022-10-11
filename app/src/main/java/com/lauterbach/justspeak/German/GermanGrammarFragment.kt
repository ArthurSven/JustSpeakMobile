package com.lauterbach.justspeak.German

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lauterbach.justspeak.German.GermanGrammar.GermanAdjectives
import com.lauterbach.justspeak.German.GermanGrammar.GermanAlphabet
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
        return binding.root

    }

}