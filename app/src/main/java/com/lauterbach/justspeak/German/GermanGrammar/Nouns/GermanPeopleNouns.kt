package com.lauterbach.justspeak.German.GermanGrammar.Nouns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.DefiniteArtikelAdapter
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanPeopleNounAdapter
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData

class GermanPeopleNouns : AppCompatActivity() {

    lateinit var gerPeopleList: ArrayList<GermanPeopleNounData>
    lateinit var gerPeople: Array<String>
    lateinit var engPeople: Array<String>
    lateinit var adapter: GermanPeopleNounAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noun_people_german)

        displayPeopleNouns()

        val adapter = GermanPeopleNounAdapter(gerPeopleList)
        recyclerView = findViewById(R.id.GPNRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun displayPeopleNouns() {

        gerPeopleList = arrayListOf<GermanPeopleNounData>()
        gerPeople = arrayOf(
            getString(R.string.gerPeople1),
            getString(R.string.gerPeople2),
            getString(R.string.gerPeople3),
            getString(R.string.gerPeople4),
            getString(R.string.gerPeople5),
            getString(R.string.gerPeople6),
            getString(R.string.gerPeople7),
            getString(R.string.gerPeople8),
            getString(R.string.gerPeople9),
            getString(R.string.gerPeople10),
            getString(R.string.gerPeople11),
            getString(R.string.gerPeople12),
            getString(R.string.gerPeople13),
            getString(R.string.gerPeople14),
            getString(R.string.gerPeople15),
            getString(R.string.gerPeople16),
            getString(R.string.gerPeople17),
            getString(R.string.gerPeople18),
            getString(R.string.gerPeople19),
            getString(R.string.gerPeople20),
            getString(R.string.gerPeople21),
            getString(R.string.gerPeople22),
            getString(R.string.gerPeople23),
            getString(R.string.gerPeople24),
            getString(R.string.gerPeople25),
            getString(R.string.gerPeople26)
        )
        engPeople = arrayOf(
            getString(R.string.engPeople1),
            getString(R.string.engPeople2),
            getString(R.string.engPeople3),
            getString(R.string.engPeople4),
            getString(R.string.engPeople5),
            getString(R.string.engPeople6),
            getString(R.string.engPeople7),
            getString(R.string.engPeople8),
            getString(R.string.engPeople9),
            getString(R.string.engPeople10),
            getString(R.string.engPeople11),
            getString(R.string.engPeople12),
            getString(R.string.engPeople13),
            getString(R.string.engPeople14),
            getString(R.string.engPeople15),
            getString(R.string.engPeople16),
            getString(R.string.engPeople17),
            getString(R.string.engPeople18),
            getString(R.string.engPeople19),
            getString(R.string.engPeople20),
            getString(R.string.engPeople21),
            getString(R.string.engPeople22),
            getString(R.string.engPeople23),
            getString(R.string.engPeople24),
            getString(R.string.engPeople25),
            getString(R.string.engPeople26)
        )
        for (i in gerPeople.indices) {
            val pple = GermanPeopleNounData(
                gerPeople[i], engPeople[i]
            )
            gerPeopleList.add(pple)
        }
    }
}