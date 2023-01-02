package com.lauterbach.justspeak.German.GermanGrammar.Nouns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanPlaceAdapter
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData


class GermanPlaceNoun : AppCompatActivity() {

    lateinit var germanPlaceList: ArrayList<GermanPeopleNounData>
    lateinit var ort: Array<String>
    lateinit var place: Array<String>
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: GermanPlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noun_place_german)

        displayGermanPlaces()

        val adapter = GermanPlaceAdapter(germanPlaceList)
        recyclerView = findViewById(R.id.GermanPlaceRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun displayGermanPlaces() {
        germanPlaceList = arrayListOf<GermanPeopleNounData>()

        ort = arrayOf(
            getString(R.string.gerplace1),
            getString(R.string.gerplace2),
            getString(R.string.gerplace3),
            getString(R.string.gerplace4),
            getString(R.string.gerplace5),
            getString(R.string.gerplace6),
            getString(R.string.gerplace7),
            getString(R.string.gerplace8),
            getString(R.string.gerplace9),
            getString(R.string.gerplace10),
            getString(R.string.gerplace11),
            getString(R.string.gerplace12),
            getString(R.string.gerplace13)
        )

        place = arrayOf(
            getString(R.string.engPlace1),
            getString(R.string.engPlace2),
            getString(R.string.engPlace3),
            getString(R.string.engPlace4),
            getString(R.string.engPlace5),
            getString(R.string.engPlace6),
            getString(R.string.engPlace7),
            getString(R.string.engPlace8),
            getString(R.string.engPlace9),
            getString(R.string.engPlace1),
            getString(R.string.engPlace10),
            getString(R.string.engPlace11),
            getString(R.string.engPlace12),
        )

        for(i in ort.indices) {
            val orten = GermanPeopleNounData(
                ort[i], place[i]
            )
            germanPlaceList.add(orten)
        }
    }
}