package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanIndefiniteData
import org.w3c.dom.Text

class IndefiniteArtikelAdapter(
    var indefiniteArtikelList: ArrayList<GermanIndefiniteData>
) : RecyclerView.Adapter<IndefiniteArtikelAdapter.IndefiniteArtViewHolder>() {

    class IndefiniteArtViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val indCase : TextView = itemView.findViewById(R.id.IndArtCase)
        val indMasc : TextView = itemView.findViewById(R.id.IndArtMasc)
        val indFem : TextView = itemView.findViewById(R.id.IndArtFem)
        val indNeu : TextView = itemView.findViewById(R.id.IndArtNeu)
        val indPlu : TextView = itemView.findViewById(R.id.IndArtPlu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndefiniteArtViewHolder {
        val indArtikel = LayoutInflater.from(parent.context).inflate(R.layout.indefinite_article_item
        , parent, false)
        return IndefiniteArtViewHolder(indArtikel)
    }

    override fun getItemCount(): Int {
       return indefiniteArtikelList.size
    }

    override fun onBindViewHolder(holder: IndefiniteArtViewHolder, position: Int) {
        val indArt = indefiniteArtikelList[position]
        holder.indCase.text = indArt.case
        holder.indMasc.text = indArt.masc
        holder.indFem.text = indArt.fem
        holder.indNeu.text = indArt.neu
        holder.indPlu.text = indArt.plu
    }
}