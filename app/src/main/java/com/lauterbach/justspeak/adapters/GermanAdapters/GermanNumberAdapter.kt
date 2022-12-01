package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanNumberData
import org.w3c.dom.Text

class GermanNumberAdapter(val germanNumberList: ArrayList<GermanNumberData>
) : RecyclerView.Adapter<GermanNumberAdapter.GermanNumberViewHolder> () {

    class GermanNumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val germanNumber: TextView = itemView.findViewById(R.id.germanNumber)
        val gerPro: TextView = itemView.findViewById(R.id.germanPro)
        val englishNumber: TextView = itemView.findViewById(R.id.englishNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanNumberViewHolder {
        val deutNum = LayoutInflater.from(parent.context).inflate(R.layout.german_number_item,
        parent, false)
        return GermanNumberViewHolder(deutNum)
    }

    override fun getItemCount(): Int {
        return germanNumberList.size
    }

    override fun onBindViewHolder(holder: GermanNumberViewHolder, position: Int) {
        val gerNum = germanNumberList[position]
        holder.germanNumber.text = gerNum.germanNumber
        holder.gerPro.text = gerNum.germanPro
        holder.englishNumber.text = gerNum.englishNumber
    }
}