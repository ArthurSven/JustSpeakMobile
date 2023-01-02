package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanReflexivePronounData

class GermanReflexiveAdapter(val gerReflexList:ArrayList<GermanReflexivePronounData>
) : RecyclerView.Adapter<GermanReflexiveAdapter.GermanReflexiveViewHolder> () {

    class GermanReflexiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gerPronoun : TextView = itemView.findViewById(R.id.GermanPronoun)
        val gerReflexPronoun : TextView = itemView.findViewById(R.id.GermanReflexivePronoun)
        val gerExample : TextView = itemView.findViewById(R.id.GermanExample)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanReflexiveViewHolder {
        val second = LayoutInflater.from(parent.context).inflate(R.layout.accusative_pronoun_item,
        parent, false)
        return GermanReflexiveViewHolder(second)
    }

    override fun onBindViewHolder(holder: GermanReflexiveViewHolder, position: Int) {
        val third = gerReflexList[position]
        holder.gerPronoun.text = third.pronoun
        holder.gerReflexPronoun.text = third.reflex
        holder.gerExample.text = third.beispiel
    }

    override fun getItemCount(): Int {
        return gerReflexList.size
    }
}