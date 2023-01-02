package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData

class GermanPeopleNounAdapter(val gerPeopleNounList : ArrayList<GermanPeopleNounData>) :
RecyclerView.Adapter<GermanPeopleNounAdapter.GermanPeopleNounViewHolder> (){

    class GermanPeopleNounViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanPple : TextView = itemView.findViewById(R.id.germanNoun)
        val englishPple: TextView = itemView.findViewById(R.id.englishNoun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanPeopleNounViewHolder {
        val gerEng = LayoutInflater.from(parent.context).inflate(R.layout.german_people_noun_item,
        parent, false)
        return GermanPeopleNounViewHolder(gerEng)
    }

    override fun getItemCount(): Int {
        return gerPeopleNounList.size
    }

    override fun onBindViewHolder(holder: GermanPeopleNounViewHolder, position: Int) {
        val engGerHolder = gerPeopleNounList[position]
        holder.germanPple.text = engGerHolder.german
        holder.englishPple.text = engGerHolder.english
    }
}