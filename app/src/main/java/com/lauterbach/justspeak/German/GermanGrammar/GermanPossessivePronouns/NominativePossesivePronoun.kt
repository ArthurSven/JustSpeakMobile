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
    lateinit var pos4: Array<String>
    lateinit var pos5: Array<String>
    lateinit var pos6: Array<String>
    lateinit var pos7: Array<String>
    lateinit var pos8: Array<String>
    lateinit var pos9: Array<String>
    lateinit var nomPossAdapter: NomPossessiveAdapter
    lateinit var secondNomPossAdapter: NomPossessiveAdapter
    lateinit var thirdNomPossAdapter: NomPossessiveAdapter
    lateinit var firstRecycler: RecyclerView
    lateinit var secondRecycler: RecyclerView
    lateinit var thirdRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nominative_possesive_pronoun)

        displayFirstTable()
        val nomPossAdapter = NomPossessiveAdapter(possessiveList)
        firstRecycler = findViewById(R.id.nomPossRecycler1)
        firstRecycler.adapter = nomPossAdapter
        firstRecycler.layoutManager = LinearLayoutManager(this)

        displaySecondTable()
        val secondNomPossAdapter = NomPossessiveAdapter(possessiveList)
        secondRecycler = findViewById(R.id.nomPossRecycler2)
        secondRecycler.adapter = secondNomPossAdapter
        secondRecycler.layoutManager = LinearLayoutManager(this)

        displayThirdTable()
        val thirdNomPossAdapter = NomPossessiveAdapter(possessiveList)
        thirdRecycler = findViewById(R.id.nomPossRecycler3)
        thirdRecycler.adapter = thirdNomPossAdapter
        thirdRecycler.layoutManager = LinearLayoutManager(this)

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

    fun displaySecondTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        pos4 = arrayOf(
            getString(R.string.seiner),
            getString(R.string.seine),
            getString(R.string.seines),
            getString(R.string.seine)
        )
        pos5 = arrayOf(
            getString(R.string.seiner),
            getString(R.string.seine),
            getString(R.string.seines),
            getString(R.string.seine)
        )
        pos6 = arrayOf(
            getString(R.string.unserer),
            getString(R.string.unsere),
            getString(R.string.unseres),
            getString(R.string.unsere)
        )

        for(j in gender.indices) {
            val zeig = GermanPossessivePronoun(
                gender[j], pos4[j], pos5[j], pos6[j],
            )
            possessiveList.add(
                zeig
            )
        }
    }
    fun displayThirdTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        pos7 = arrayOf(
            getString(R.string.eurer),
            getString(R.string.eure),
            getString(R.string.eures),
            getString(R.string.eure)
        )
        pos8 = arrayOf(
            getString(R.string.ihrer),
            getString(R.string.ihre),
            getString(R.string.ihres),
            getString(R.string.ihre)
        )
        pos9 = arrayOf(
            getString(R.string.ihrer),
            getString(R.string.ihre),
            getString(R.string.ihres),
            getString(R.string.ihre)
        )

        for(a in gender.indices) {
            val schau = GermanPossessivePronoun(
                gender[a], pos7[a], pos8[a], pos9[a],
            )
            possessiveList.add(
                schau
            )
        }
    }
}