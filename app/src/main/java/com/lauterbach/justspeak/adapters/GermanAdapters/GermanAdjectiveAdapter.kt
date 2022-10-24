package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanAdjectiveData

class GermanAdjectiveAdapter(var germanAdjectiveList: ArrayList<GermanAdjectiveData>
) : RecyclerView.Adapter<GermanAdjectiveAdapter.GermanAdjectivesViewHolder>(){

    inner class GermanAdjectivesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanAdjective: TextView = itemView.findViewById(R.id.gerAdjective)
        val germanEnglish: TextView = itemView.findViewById(R.id.gerAdjEng)
        val gerSentence: TextView = itemView.findViewById(R.id.GerAdjSentence)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanAdjectivesViewHolder {
        val deutAdjective =
            LayoutInflater.from(parent.context).inflate(R.layout.german_adjective_table_item, parent
            , false)
        return GermanAdjectivesViewHolder(deutAdjective)
    }

    override fun getItemCount(): Int {
       return germanAdjectiveList.size
    }

    override fun onBindViewHolder(holder: GermanAdjectivesViewHolder, position: Int) {
        val deutAdj = germanAdjectiveList[position]
        holder.germanAdjective.text = deutAdj.gerAdjective
        holder.germanEnglish.text = deutAdj.gerEngAdj
        holder.gerSentence.text = deutAdj.gerAdjSent
    }
}