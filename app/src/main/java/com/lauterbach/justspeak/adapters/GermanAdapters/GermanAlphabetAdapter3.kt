package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanAlphabet3

class GermanAlphabetAdapter3(
    var letterList: ArrayList<GermanAlphabet3>
) : RecyclerView.Adapter<GermanAlphabetAdapter3.GermanAlphabet3ViewHolder>() {

    inner class GermanAlphabet3ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanBuchstabe : TextView = itemView.findViewById(R.id.germanLetter)
        val germanAussprache : TextView = itemView.findViewById(R.id.germanPronunciation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanAlphabet3ViewHolder {
        val german3 = LayoutInflater.from(parent.context).inflate(R.layout.german_alphabet_row,
            parent, false)
        return GermanAlphabet3ViewHolder(german3)
    }

    override fun getItemCount(): Int {
        return letterList.size
    }

    override fun onBindViewHolder(holder: GermanAlphabet3ViewHolder, position: Int) {
       val deuLetter = letterList[position]
        holder.germanBuchstabe.text = deuLetter.thirdLetter
        holder.germanAussprache.text = deuLetter.thirdPronunciation
    }
}