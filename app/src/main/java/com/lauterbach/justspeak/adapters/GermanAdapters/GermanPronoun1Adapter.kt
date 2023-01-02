package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanPronounData

class GermanPronoun1Adapter(val germanPronounList1: ArrayList<GermanPronounData>
) : RecyclerView.Adapter<GermanPronoun1Adapter.GermanPronoun1ViewHolder>() {

    inner class GermanPronoun1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nominative: TextView = itemView.findViewById(R.id.nom)
        val accusative: TextView = itemView.findViewById(R.id.acc)
        val dative: TextView = itemView.findViewById(R.id.dat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanPronoun1ViewHolder {
       val pronoun = LayoutInflater.from(parent.context).inflate(R.layout.german_pronoun_item,
           parent, false)
        return GermanPronoun1ViewHolder(pronoun)
    }

    override fun getItemCount(): Int {
        return germanPronounList1.size
    }

    override fun onBindViewHolder(holder: GermanPronoun1ViewHolder, position: Int) {
        val pro = germanPronounList1[position]
        holder.nominative.text = pro.nom
        holder.accusative.text = pro.acc
        holder.dative.text = pro.dat
    }
}