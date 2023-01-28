package com.lauterbach.justspeak.German.GermanGrammar.GermanPossessivePronouns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanPronoun1Adapter
import com.lauterbach.justspeak.adapters.GermanAdapters.Possessive.NomPossessiveAdapter
import com.lauterbach.justspeak.data.GermanData.GermanPossessivePronoun

class NominativePossesivePronoun : AppCompatActivity() {
    lateinit var possessiveList: ArrayList<GermanPossessivePronoun>
    lateinit var gender: Array<String>
    lateinit var pos1: Array<String>
    lateinit var pos2: Array<String>
    lateinit var pos3: Array<String>
    lateinit var nomPossdapter: NomPossessiveAdapter
    lateinit var firstRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nominative_possesive_pronoun)

        displayFirstTable()
        val nomPossdapter = NomPossessiveAdapter(possessiveList)
        firstRecycler = findViewById(R.id.nomPossRecycler1)
        firstRecycler.adapter = nomPossdapter
        firstRecycler.layoutManager = LinearLayoutManager(this)
    }

    private fun displayFirstTable() {

        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        pos1 = arrayOf(
            getString(R.string.meiner),
            getString(R.string.meine),
            getString(R.string.meines),
            getString(R.string.meine)
        )
        pos2 = arrayOf(
            getString(R.string.deiner),
            getString(R.string.deine),
            getString(R.string.deines),
            getString(R.string.deine)
        )
        pos3 = arrayOf(
            getString(R.string.ihrer),
            getString(R.string.ihre),
            getString(R.string.ihres),
            getString(R.string.ihre)
        )

        for(i in gender.indices) {
            val show = GermanPossessivePronoun(
                gender[i], pos1[i], pos2[i], pos3[i],
            )
            possessiveList.add(
                show
            )
        }
    }
}