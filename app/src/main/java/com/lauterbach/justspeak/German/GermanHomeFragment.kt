package com.lauterbach.justspeak.German

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.FragmentGermanHomeBinding
import com.lauterbach.justspeak.databinding.FragmentLanguageBinding


class GermanHomeFragment : Fragment() {

    lateinit var binding: FragmentGermanHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGermanHomeBinding.inflate(layoutInflater)
        return binding.root
    }

}