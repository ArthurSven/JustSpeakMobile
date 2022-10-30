package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanDefiniteData

class DefiniteArtikelAdapter(
    var bestimmteArtikelList: ArrayList<GermanDefiniteData>
) : RecyclerView.Adapter<DefiniteArtikelAdapter.DefiniteArtikelViewHolder>() {

    class DefiniteArtikelViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var bestCase : TextView = itemView.findViewById(R.id.GerArtCase)
        var bestMasc : TextView = itemView.findViewById(R.id.GerArtMasc)
        var bestFem : TextView = itemView.findViewById(R.id.GerArtFem)
        var bestNeu : TextView = itemView.findViewById(R.id.GerArtNeu)
        var bestPlu : TextView = itemView.findViewById(R.id.GerArtPlu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefiniteArtikelViewHolder {
        val bestimmt = LayoutInflater.from(parent.context).inflate(R.layout.german_article_item, parent
        , false)
        return DefiniteArtikelViewHolder(bestimmt)
    }

    override fun getItemCount(): Int {
        return bestimmteArtikelList.size
    }

    override fun onBindViewHolder(holder: DefiniteArtikelViewHolder, position: Int) {
        val defn = bestimmteArtikelList[position]
        holder.bestCase.text = defn.case
        holder.bestMasc.text = defn.masc
        holder.bestFem.text = defn.fem
        holder.bestNeu.text = defn.neu
        holder.bestPlu.text = defn.plu
    }
}