package com.lauterbach.justspeak.German.GermanGrammar.GermanPossessivePronouns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.Possessive.NomPossessiveAdapter
import com.lauterbach.justspeak.data.GermanData.GermanPossessivePronoun

class DativePossessivePronoun : AppCompatActivity() {
    lateinit var possessiveList: ArrayList<GermanPossessivePronoun>
    lateinit var gender: Array<String>
    lateinit var dat1: Array<String>
    lateinit var dat2: Array<String>
    lateinit var dat3: Array<String>
    lateinit var dat4: Array<String>
    lateinit var dat5: Array<String>
    lateinit var dat6: Array<String>
    lateinit var dat7: Array<String>
    lateinit var dat8: Array<String>
    lateinit var dat9: Array<String>
    lateinit var datPossAdapter: NomPossessiveAdapter
    lateinit var secondDatPossAdapter: NomPossessiveAdapter
    lateinit var thirdDatPossAdapter: NomPossessiveAdapter
    lateinit var firstRecycler: RecyclerView
    lateinit var secondRecycler: RecyclerView
    lateinit var thirdRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dative_possessive_pronoun)

        datFirstTable()
        datPossAdapter = NomPossessiveAdapter(possessiveList)
        firstRecycler = findViewById(R.id.datPossRecycler1)
        firstRecycler.adapter = datPossAdapter
        firstRecycler.layoutManager = LinearLayoutManager(this)

        datSecondTable()
        secondDatPossAdapter = NomPossessiveAdapter(possessiveList)
        secondRecycler = findViewById(R.id.datPossRecycler2)
        secondRecycler.adapter = secondDatPossAdapter
        secondRecycler.layoutManager = LinearLayoutManager(this)

        datThirdTable()
        thirdDatPossAdapter = NomPossessiveAdapter(possessiveList)
        thirdRecycler = findViewById(R.id.datPossRecycler3)
        thirdRecycler.adapter = thirdDatPossAdapter
        thirdRecycler.layoutManager = LinearLayoutManager(this)
    }

    fun datFirstTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        dat1 = arrayOf(
            getString(R.string.meinem),
            getString(R.string.meiner),
            getString(R.string.meinem),
            getString(R.string.meiner)
        )
        dat2 = arrayOf(
            getString(R.string.deinem),
            getString(R.string.deiner),
            getString(R.string.deinem),
            getString(R.string.deiner)
        )
        dat3 = arrayOf(
            getString(R.string.ihrem),
            getString(R.string.ihrer),
            getString(R.string.ihrem),
            getString(R.string.ihrer)
        )
        for(i in dat1.indices) {
            val gudrun = GermanPossessivePronoun(
                gender[i], dat1[i], dat2[i], dat3[i]
            )
            possessiveList.add(
                gudrun
            )
        }
    }
    fun datSecondTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        dat4 = arrayOf(
            getString(R.string.seinem),
            getString(R.string.seiner),
            getString(R.string.seinem),
            getString(R.string.seiner)
        )
        dat5 = arrayOf(
            getString(R.string.seinem),
            getString(R.string.seiner),
            getString(R.string.seinem),
            getString(R.string.seiner)
        )
        dat6 = arrayOf(
            getString(R.string.unserem),
            getString(R.string.unserer),
            getString(R.string.unserem),
            getString(R.string.unserer)
        )
        for(j in dat4.indices) {
            val enslin = GermanPossessivePronoun(
                gender[j], dat4[j], dat5[j], dat6[j]
            )
            possessiveList.add(
                enslin
            )
        }
    }
    fun datThirdTable() {
        possessiveList = arrayListOf<GermanPossessivePronoun>()
        gender = arrayOf(
            getString(R.string.masc),
            getString(R.string.fem),
            getString(R.string.neu),
            getString(R.string.plu)
        )
        dat7 = arrayOf(
            getString(R.string.eurem),
            getString(R.string.eurer),
            getString(R.string.eurem),
            getString(R.string.eurer)
        )
        dat8 = arrayOf(
            getString(R.string.ihrem),
            getString(R.string.ihrer),
            getString(R.string.ihrem),
            getString(R.string.ihrer)
        )
        dat9 = arrayOf(
            getString(R.string.ihrem),
            getString(R.string.ihrer),
            getString(R.string.ihrem),
            getString(R.string.ihrer)
        )
        for(l in dat7.indices) {
            val meinhof = GermanPossessivePronoun(
                gender[l], dat7[l], dat8[l], dat9[l]
            )
            possessiveList.add(
                meinhof
            )
        }
    }
}