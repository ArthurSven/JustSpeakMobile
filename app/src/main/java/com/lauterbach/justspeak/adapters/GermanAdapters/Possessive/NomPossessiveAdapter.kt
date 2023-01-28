package com.lauterbach.justspeak.adapters.GermanAdapters.Possessive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanPossessivePronoun

class NomPossessiveAdapter(val possessiveList: ArrayList<GermanPossessivePronoun>) :
    RecyclerView.Adapter<NomPossessiveAdapter.NomPossessiveViewHolder> () {
        class NomPossessiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val genderPoss : TextView = itemView.findViewById(R.id.possessive1)
            val firstPoss : TextView = itemView.findViewById(R.id.possessive2)
            val secondPoss : TextView = itemView.findViewById(R.id.possessive3)
            val thirdPoss : TextView = itemView.findViewById(R.id.possessive4)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomPossessiveViewHolder {
       val possessive = LayoutInflater.from(parent.context).inflate(R.layout.possessive_pronoun_item,
       parent, false)
        return NomPossessiveViewHolder(possessive)
    }
    override fun getItemCount(): Int {
       return possessiveList.size
    }
    override fun onBindViewHolder(holder: NomPossessiveViewHolder, position: Int) {
        val binder = possessiveList[position]
        holder.genderPoss.text = binder.gender
        holder.firstPoss.text = binder.poss1
        holder.secondPoss.text = binder.poss2
        holder.thirdPoss.text = binder.poss3
    }
}