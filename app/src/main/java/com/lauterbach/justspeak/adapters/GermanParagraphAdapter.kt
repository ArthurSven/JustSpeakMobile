package com.lauterbach.justspeak.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanParagraphData

class GermanParagraphAdapter(private val germanList : ArrayList<GermanParagraphData>) :
RecyclerView.Adapter<GermanParagraphAdapter.GermanViewHolder>(){

    class GermanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val GermanTextView : TextView = itemView.findViewById(R.id.paragrapho)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanViewHolder {
        val deutsch = LayoutInflater.from(parent.context).inflate(R.layout.paragraph_item, parent, false)
         return GermanViewHolder(deutsch)
    }

    override fun onBindViewHolder(holder: GermanViewHolder, position: Int) {
        val tysk = germanList[position]
        holder.GermanTextView.text = tysk.germanContent
    }

    override fun getItemCount(): Int {
        return germanList.size
    }
}