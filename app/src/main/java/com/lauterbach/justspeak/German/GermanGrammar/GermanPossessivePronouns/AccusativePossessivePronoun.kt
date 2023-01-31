package com.lauterbach.justspeak.German.GermanGrammar.GermanPossessivePronouns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.Possessive.NomPossessiveAdapter
import com.lauterbach.justspeak.data.GermanData.GermanDativePronounData
import com.lauterbach.justspeak.data.GermanData.GermanPossessivePronoun

class AccusativePossessivePronoun : AppCompatActivity() {
    lateinit var possessiveList: ArrayList<GermanPossessivePronoun>
    lateinit var gender: Array<String>
    lateinit var acc1: Array<String>
    lateinit var acc2: Array<String>
    lateinit var acc3: Array<String>
    lateinit var acc4: Array<String>
    lateinit var acc5: Array<String>
    lateinit var acc6: Array<String>
    lateinit var acc7: Array<String>
    lateinit var acc8: Array<String>
    lateinit var acc9: Array<String>
    lateinit var accPossAdapter: NomPossessiveAdapter
    lateinit var secondAccPossAdapter: NomPossessiveAdapter
    lateinit var thirdAccPossAdapter: NomPossessiveAdapter
    lateinit var firstRecycler: RecyclerView
    lateinit var secondRecycler: RecyclerView
    lateinit var thirdRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accusative_possessive_pronoun)

        accFirstTable()
        accPossAdapter = NomPossessiveAdapter(possessiveList)
        firstRecycler = findViewById(R.id.accPossRecycler1)
        firstRecycler.adapter = accPossAdapter
        firstRecycler.layoutManager = LinearLayoutManager(this)

        accSecondTable()
        secondAccPossAdapter = NomPossessiveAdapter(possessiveList)
        secondRecycler = findViewById(R.id.accPossRecycler2)
        secondRecycler.adapter = secondAccPossAdapter
        secondRecycler.layoutManager = LinearLayoutManager(this)

        accThirdTable()
        thirdAccPossAdapter = NomPossessiveAdapter(possessiveList)
        thirdRecycler = findViewById(R.id.accPossRecycler3)
        thirdRecycler.adapter = thirdAccPossAdapter
        thirdRecycler.layoutManager = LinearLayoutManager(this)
    }
    fun accFirstTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        acc1 = arrayOf(
            getString(R.string.meinen),
            getString(R.string.meine),
            getString(R.string.meines),
            getString(R.string.meine)
        )
        acc2 = arrayOf(
            getString(R.string.deinen),
            getString(R.string.deine),
            getString(R.string.deines),
            getString(R.string.deine)
        )
        acc3 = arrayOf(
            getString(R.string.ihren),
            getString(R.string.ihre),
            getString(R.string.ihres),
            getString(R.string.ihre)
        )
        for(i in acc1.indices) {
            val bader = GermanPossessivePronoun(
                gender[i], acc1[i], acc2[i], acc3[i]
            )
            possessiveList.add(
                bader
            )
        }
    }

    fun accSecondTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        acc4 = arrayOf(
            getString(R.string.seinen),
            getString(R.string.seine),
            getString(R.string.seines),
            getString(R.string.seine)
        )
        acc5 = arrayOf(
            getString(R.string.seinen),
            getString(R.string.seine),
            getString(R.string.seines),
            getString(R.string.seine)
        )
        acc6 = arrayOf(
            getString(R.string.unseren),
            getString(R.string.unsere),
            getString(R.string.unseres),
            getString(R.string.unsere)
        )
        for(j in acc4.indices) {
            val andreas = GermanPossessivePronoun(
                gender[j], acc4[j], acc5[j], acc6[j]
            )
            possessiveList.add(
                andreas
            )
        }
    }

    fun accThirdTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        acc7 = arrayOf(
            getString(R.string.euren),
            getString(R.string.eure),
            getString(R.string.eures),
            getString(R.string.eure)
        )
        acc8 = arrayOf(
            getString(R.string.ihren),
            getString(R.string.ihre),
            getString(R.string.ihres),
            getString(R.string.ihre)
        )
        acc9 = arrayOf(
            getString(R.string.ihren),
            getString(R.string.ihre),
            getString(R.string.ihres),
            getString(R.string.ihre)
        )
        for(l in acc7.indices) {
            val ulrike = GermanPossessivePronoun(
                gender[l], acc7[l], acc8[l], acc9[l]
            )
            possessiveList.add(
                ulrike
            )
        }
    }
}