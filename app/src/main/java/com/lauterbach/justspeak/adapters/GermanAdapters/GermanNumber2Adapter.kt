package com.lauterbach.justspeak.adapters.GermanAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.data.GermanData.GermanNumberData
import org.w3c.dom.Text

class GermanNumber2Adapter(val secondGerNoList : ArrayList<GermanNumberData>
) : RecyclerView.Adapter<GermanNumber2Adapter.GermanNumber2ViewHolder> () {

    class GermanNumber2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val deuNummer: TextView = itemView.findViewById(R.id.germanNumber)
        val deuAus: TextView = itemView.findViewById(R.id.germanPro)
        val engNumber: TextView = itemView.findViewById(R.id.englishNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GermanNumber2ViewHolder {
        val dreissig = LayoutInflater.from(parent.context).inflate(R.layout.german_number_item,
            parent, false)
        return GermanNumber2ViewHolder(dreissig)
    }

    override fun onBindViewHolder(holder: GermanNumber2ViewHolder, position: Int) {
        val vierzig = secondGerNoList[position]
        holder.deuNummer.text = vierzig.germanNumber
        holder.deuAus.text = vierzig.germanPro
        holder.engNumber.text = vierzig.englishNumber
    }

    override fun getItemCount(): Int {
        return secondGerNoList.size
    }
}