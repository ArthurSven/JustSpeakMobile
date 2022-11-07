package com.lauterbach.justspeak.German.GermanGrammar.Nouns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanBodyAdapter
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData

class GermanBodyNoun : AppCompatActivity() {

    lateinit var korperList: ArrayList<GermanPeopleNounData>
    lateinit var gerKorper: Array<String>
    lateinit var engBody: Array<String>
    lateinit var adapter: GermanBodyAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noun_body_german)

        displayBodyNouns()

        val adapter = GermanBodyAdapter(korperList)
        recyclerView = findViewById(R.id.GermanHumanRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun displayBodyNouns() {

        korperList = arrayListOf<GermanPeopleNounData>()
        gerKorper = arrayOf(
            getString(R.string.gerBody1),
            getString(R.string.gerBody2),
            getString(R.string.gerBody3),
            getString(R.string.gerBody4),
            getString(R.string.gerBody5),
            getString(R.string.gerBody6),
            getString(R.string.gerBody7),
            getString(R.string.gerBody8),
            getString(R.string.gerBody9),
            getString(R.string.gerBody10),
            getString(R.string.gerBody11),
            getString(R.string.gerBody12),
            getString(R.string.gerBody13),
            getString(R.string.gerBody14),
            getString(R.string.gerBody15),
            getString(R.string.gerBody16),
            getString(R.string.gerBody17)
        )
        engBody = arrayOf(
            getString(R.string.engBody1),
            getString(R.string.engBody2),
            getString(R.string.engBody3),
            getString(R.string.engBody4),
            getString(R.string.engBody5),
            getString(R.string.engBody6),
            getString(R.string.engBody7),
            getString(R.string.engBody8),
            getString(R.string.engBody9),
            getString(R.string.engBody10),
            getString(R.string.engBody11),
            getString(R.string.engBody12),
            getString(R.string.engBody13),
            getString(R.string.engBody14),
            getString(R.string.engBody15),
            getString(R.string.engBody16),
            getString(R.string.engBody17)
        )
        for (i in gerKorper.indices) {
            val gerBody = GermanPeopleNounData(
                gerKorper[i], engBody[i]
            )
            korperList.add(gerBody)
        }
    }
}