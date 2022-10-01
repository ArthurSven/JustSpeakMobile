package com.lauterbach.justspeak.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lauterbach.justspeak.German.GermanActivity
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.FragmentLanguageBinding

class LanguageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentLanguageBinding.inflate(layoutInflater)

        //Clickable cards
        binding.german.setOnClickListener {
            val intent = Intent (this@LanguageFragment.requireContext(), GermanActivity::class.java )
            startActivity(intent)
        }
        return binding.root
    }

}