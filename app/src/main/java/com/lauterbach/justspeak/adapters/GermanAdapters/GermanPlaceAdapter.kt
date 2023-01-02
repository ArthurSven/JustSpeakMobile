package com.lauterbach.justspeak.adapters.GermanAdapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData

class GermanPlaceAdapter(val germanPlaceList: ArrayList<GermanPeopleNounData>
) : RecyclerView.Adapter<GermanPlaceAdapter.GermanPlaceViewHolder>() {

    class GermanPlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanPlace : TextView = itemView.findViewById(R.id.germanNoun)
        val englishPlace : TextView = itemView.findViewById(R.id.englishNoun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanPlaceViewHolder {
        val place = LayoutInflater.from(parent.context).inflate(R.layout.german_people_noun_item,
        parent, false)
        return GermanPlaceViewHolder(place)
    }

    override fun getItemCount(): Int {
        return germanPlaceList.size
    }

    override fun onBindViewHolder(holder: GermanPlaceViewHolder, position: Int) {
        val ort = germanPlaceList[position]
        holder.germanPlace.text = ort.german
        holder.englishPlace.text = ort.english
    }
}