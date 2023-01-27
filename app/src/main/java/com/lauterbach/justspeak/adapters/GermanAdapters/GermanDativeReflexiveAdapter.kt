package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanDativePronounData

class GermanDativeReflexiveAdapter(
    val gerDatReflexiveList: ArrayList<GermanDativePronounData>) :
    RecyclerView.Adapter<GermanDativeReflexiveAdapter.GermanDativeReflexiveViewHolder>() {

        class GermanDativeReflexiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val deuDatPro : TextView = itemView.findViewById(R.id.GermanPronoun)
            val gerDatReflexPronoun : TextView = itemView.findViewById(R.id.GermanReflexivePronoun)
            val gerDatExample : TextView = itemView.findViewById(R.id.GermanExample)
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GermanDativeReflexiveViewHolder {
       val fourth = LayoutInflater.from(parent.context).inflate(R.layout.accusative_pronoun_item,
       parent, false)
        return GermanDativeReflexiveViewHolder(fourth)
    }

    override fun getItemCount(): Int {
        return gerDatReflexiveList.size
    }

    override fun onBindViewHolder(holder: GermanDativeReflexiveViewHolder, position: Int) {
        val fifth = gerDatReflexiveList[position]
        holder.deuDatPro.text = fifth.datPro
        holder.gerDatReflexPronoun.text = fifth.datReflex
        holder.gerDatExample.text = fifth.datBeispiel
    }
}