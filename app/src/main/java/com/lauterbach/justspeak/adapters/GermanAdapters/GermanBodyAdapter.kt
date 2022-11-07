package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData

class GermanBodyAdapter(val korperlist: ArrayList<GermanPeopleNounData>
) : RecyclerView.Adapter<GermanBodyAdapter.GermanBodyViewHolder> () {

    class GermanBodyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gerKorper: TextView = itemView.findViewById(R.id.germanNoun)
        val engKorper: TextView = itemView.findViewById(R.id.englishNoun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanBodyViewHolder {
        val korperShow = LayoutInflater.from(parent.context).inflate(R.layout.german_people_noun_item,
        parent, false)
        return GermanBodyViewHolder(korperShow)
    }

    override fun getItemCount(): Int {
        return korperlist.size
    }

    override fun onBindViewHolder(holder: GermanBodyViewHolder, position: Int) {
        val korper = korperlist[position]
        holder.gerKorper.text = korper.german
        holder.engKorper.text = korper.english
    }
}