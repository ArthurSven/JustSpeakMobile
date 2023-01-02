package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanDefiniteData

class GermanDefiniteAdapter(val germanDefiniteArticleList: ArrayList<GermanDefiniteData>
) : RecyclerView.Adapter<GermanDefiniteAdapter.GermanDefiniteViewHolder>() {

    inner class GermanDefiniteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanDefCase : TextView = itemView.findViewById(R.id.gerArtCase)
        val germanDefMasc : TextView = itemView.findViewById(R.id.gerArtMasc)
        val germanDefFem: TextView = itemView.findViewById(R.id.gerArtFem)
        val germanDefNeu: TextView = itemView.findViewById(R.id.gerArtNeu)
        val germanDefPlu: TextView = itemView.findViewById(R.id.gerArtPlu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanDefiniteViewHolder {
        val definiteArticle = LayoutInflater.from(parent.context).inflate(
            R.layout.german_article_row, parent, false)
        return GermanDefiniteViewHolder(definiteArticle)
    }

    override fun getItemCount(): Int {
       return germanDefiniteArticleList.size
    }

    override fun onBindViewHolder(holder: GermanDefiniteViewHolder, position: Int) {
       val deuBestimmt = germanDefiniteArticleList[position]
        holder.germanDefCase.text = deuBestimmt.case
        holder.germanDefMasc.text = deuBestimmt.masc
        holder.germanDefFem.text = deuBestimmt.fem
        holder.germanDefNeu.text = deuBestimmt.neu
        holder.germanDefPlu.text = deuBestimmt.plu
    }
}