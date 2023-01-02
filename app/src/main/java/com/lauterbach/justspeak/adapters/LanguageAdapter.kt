package com.lauterbach.justspeak.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.LanguageData

//Where the adapter gets what to display
class LanguageAdapter(private val languageList : ArrayList<LanguageData>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    //Setting the adapter to work with the recyclerview
        class LanguageViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
            val languageImageView : ImageView = itemView.findViewById(R.id.cardPic)
            val languageTextView : TextView = itemView.findViewById(R.id.cardText)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val sprechen = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
    return LanguageViewHolder(sprechen)
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val lang = languageList[position]
        holder.languageImageView.setImageResource(lang.languagePic)
        holder.languageTextView.text = lang.languagetext
    }

}