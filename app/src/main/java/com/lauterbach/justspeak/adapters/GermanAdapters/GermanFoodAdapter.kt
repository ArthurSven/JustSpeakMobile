package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData
import kotlinx.coroutines.NonDisposableHandle.parent
import org.w3c.dom.Text

class GermanFoodAdapter(val essenList: ArrayList<GermanPeopleNounData>
) : RecyclerView.Adapter<GermanFoodAdapter.GermanFoodViewHolder> () {

    class GermanFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gerEssen : TextView = itemView.findViewById(R.id.germanNoun)
        val engFood : TextView = itemView.findViewById(R.id.englishNoun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanFoodViewHolder {
        val essen = LayoutInflater.from(parent.context).inflate(R.layout.german_people_noun_item,
        parent, false)
        return GermanFoodViewHolder(essen)
    }

    override fun getItemCount(): Int {
        return essenList.size
    }

    override fun onBindViewHolder(holder: GermanFoodViewHolder, position: Int) {
        val food = essenList[position]
        holder.gerEssen.text = food.german
        holder.engFood.text = food.english
    }
}