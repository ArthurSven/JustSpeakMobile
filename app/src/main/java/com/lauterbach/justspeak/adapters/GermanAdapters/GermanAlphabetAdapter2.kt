package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanAlphabet2

class GermanAlphabetAdapter2(
    var deutscheBuchstaben : ArrayList<GermanAlphabet2>
    ) : RecyclerView.Adapter<GermanAlphabetAdapter2.GermanAlphabet2ViewHolder>() {

        inner class GermanAlphabet2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val deutscheBuchstabe: TextView = itemView.findViewById(R.id.germanLetter)
            val deutscheAussprache: TextView = itemView.findViewById(R.id.germanPronunciation)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanAlphabet2ViewHolder {
        val letterView = LayoutInflater.from(parent.context).inflate(R.layout.german_alphabet_row,
        parent, false)
        return GermanAlphabet2ViewHolder(letterView)
    }

    override fun getItemCount(): Int {
       return deutscheBuchstaben.size
    }

    override fun onBindViewHolder(holder: GermanAlphabet2ViewHolder, position: Int) {
        val deuBuchstabe = deutscheBuchstaben[position]
        holder.deutscheBuchstabe.text = deuBuchstabe.buchstabe
        holder.deutscheAussprache.text = deuBuchstabe.aussprache
    }
}