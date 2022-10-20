package com.lauterbach.justspeak.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.German.GermanGrammar.GermanAlphabet
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.AlphabetData

class GermanAlphabetAdapter(
    var germanLetters: ArrayList<AlphabetData>
) : RecyclerView.Adapter<GermanAlphabetAdapter.GermanAlphabetViewHolder>() {

    inner class GermanAlphabetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanLetter: TextView = itemView.findViewById(R.id.germanLetter)
        val germanPronunciation: TextView = itemView.findViewById(R.id.germanPronunciation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanAlphabetViewHolder {
        val gerView = LayoutInflater.from(parent.context).inflate(R.layout.german_alphabet_row, parent,
        false)
        return GermanAlphabetViewHolder(gerView)
    }

    override fun onBindViewHolder(holder: GermanAlphabetViewHolder, position: Int) {
            val gerAlph = germanLetters[position]
            holder.germanLetter.text = gerAlph.letter
            holder.germanPronunciation.text = gerAlph.pronunciation
    }

    override fun getItemCount(): Int {
        return germanLetters.size
    }
}