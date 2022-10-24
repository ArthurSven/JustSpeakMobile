package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanIndefiniteData

class GermanIndefiniteAdapter(val germanIndefiniteList: ArrayList<GermanIndefiniteData>)
    : RecyclerView.Adapter<GermanIndefiniteAdapter.GermanIndefiniteViewHolder>() {

        inner class GermanIndefiniteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val gerIndCase: TextView = itemView.findViewById(R.id.gerArtCase)
            val gerIndMasc: TextView = itemView.findViewById(R.id.gerArtMasc)
            val gerIndFem: TextView = itemView.findViewById(R.id.gerArtFem)
            val gerIndNeu: TextView = itemView.findViewById(R.id.gerArtNeu)
            val gerIndPlu: TextView = itemView.findViewById(R.id.gerArtPlu)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanIndefiniteViewHolder {
        val gerIndArt = LayoutInflater.from(parent.context).inflate(R.layout.german_article_row, parent
        , false)
        return GermanIndefiniteViewHolder(gerIndArt)
    }

    override fun getItemCount(): Int {
       return germanIndefiniteList.size
    }

    override fun onBindViewHolder(holder: GermanIndefiniteViewHolder, position: Int) {
       val gerIndHolder = germanIndefiniteList[position]
        holder.gerIndCase.text = gerIndHolder.case
        holder.gerIndMasc.text = gerIndHolder.masc
        holder.gerIndFem.text = gerIndHolder.fem
        holder.gerIndNeu.text = gerIndHolder.neu
        holder.gerIndPlu.text = gerIndHolder.plu
    }
}