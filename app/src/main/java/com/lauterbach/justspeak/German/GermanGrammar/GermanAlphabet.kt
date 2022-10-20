package com.lauterbach.justspeak.German.GermanGrammar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAlphabetAdapter
import com.lauterbach.justspeak.adapters.GermanAlphabetAdapter2
import com.lauterbach.justspeak.adapters.GermanAlphabetAdapter3
import com.lauterbach.justspeak.data.AlphabetData
import com.lauterbach.justspeak.data.GermanAlphabet2
import com.lauterbach.justspeak.data.GermanAlphabet3
import com.lauterbach.justspeak.data.LanguageData


class GermanAlphabet : AppCompatActivity() {
    //First letters set
    lateinit var gerAlphabetList: ArrayList<AlphabetData>
    lateinit var letter: Array<String>
    lateinit var pronunciation: Array<String>
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: GermanAlphabetAdapter

    //Second letters set
    lateinit var deuBuchstabeListe: ArrayList<GermanAlphabet2>
    lateinit var buchstabe: Array<String>
    lateinit var aussprache: Array<String>
    lateinit var recyclerView2: RecyclerView
    lateinit var adapter2: GermanAlphabetAdapter2

    //Third letters set
    lateinit var germanAlphabetList: ArrayList<GermanAlphabet3>
    lateinit var letter3: Array<String>
    lateinit var pronunciation3: Array<String>
    lateinit var recyclerView3: RecyclerView
    lateinit var adapter3: GermanAlphabetAdapter3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_german)
        //display first set of alphabet letters
        displayAlphabetLetters()
        displaySecondBatchLetters()
        displayThirdLetters()

        //First letters recycler
        val adapter = GermanAlphabetAdapter(gerAlphabetList)
        recyclerView = findViewById(R.id.GerTableRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Second letters recycler
        val adapter2 = GermanAlphabetAdapter2(deuBuchstabeListe)
        recyclerView2 = findViewById(R.id.GerTableRecycler1)
        recyclerView2.adapter = adapter2
        recyclerView2.layoutManager = LinearLayoutManager(this)

        //Third letters recycler
        val adapter3 = GermanAlphabetAdapter3(germanAlphabetList)
        recyclerView3 = findViewById(R.id.GerTableRecycler2)
        recyclerView3.adapter = adapter3
        recyclerView3.layoutManager = LinearLayoutManager(this)

    }

    fun displayAlphabetLetters() {

        gerAlphabetList = arrayListOf<AlphabetData>()

        letter = arrayOf(
            getString(R.string.a),
            getString(R.string.b),
            getString(R.string.c),
            getString(R.string.d),
            getString(R.string.e),
            getString(R.string.f),
            getString(R.string.g),
            getString(R.string.h),
            getString(R.string.i),
            getString(R.string.j)
        )

        pronunciation = arrayOf(
            getString(R.string.aah),
            getString(R.string.bae),
            getString(R.string.tsae),
            getString(R.string.day),
            getString(R.string.eh),
            getString(R.string.eff),
            getString(R.string.gaah),
            getString(R.string.haa),
            getString(R.string.eeh),
            getString(R.string.yot)
        )

        for (i in letter.indices) {
            val matchAlphabet = AlphabetData(letter[i], pronunciation[i])
            gerAlphabetList.add(matchAlphabet)
        }
    }

    fun displaySecondBatchLetters() {
        deuBuchstabeListe = arrayListOf<GermanAlphabet2>()

        buchstabe = arrayOf(
            getString(R.string.k),
            getString(R.string.l),
            getString(R.string.m),
            getString(R.string.n),
            getString(R.string.o),
            getString(R.string.p),
            getString(R.string.q),
            getString(R.string.r),
            getString(R.string.s),
            getString(R.string.t)

        )

        aussprache= arrayOf(
            getString(R.string.kaa),
            getString(R.string.el),
            getString(R.string.em),
            getString(R.string.en),
            getString(R.string.oh),
            getString(R.string.pae),
            getString(R.string.koo),
            getString(R.string.er),
            getString(R.string.ess),
            getString(R.string.tae)
        )

        for (j in buchstabe.indices) {
            val bringeBuchstabezusammen = GermanAlphabet2(buchstabe[j], aussprache[j])
            deuBuchstabeListe.add(bringeBuchstabezusammen)
        }
    }

    fun displayThirdLetters() {

        germanAlphabetList = arrayListOf<GermanAlphabet3>()

        letter3 = arrayOf(
            getString(R.string.u),
            getString(R.string.v),
            getString(R.string.w),
            getString(R.string.x),
            getString(R.string.y),
            getString(R.string.z),
            getString(R.string.umlauta),
            getString(R.string.umlauto),
            getString(R.string.umlautu),
            getString(R.string.umlautss)
        )

        pronunciation3 = arrayOf(
            getString(R.string.ooh),
            getString(R.string.faw),
            getString(R.string.vay),
            getString(R.string.eeks),
            getString(R.string.oopsilohn),
            getString(R.string.tsett),
            getString(R.string.ae),
            getString(R.string.oe),
            getString(R.string.ue),
            getString(R.string.ss)
        )

        for (k in letter3.indices) {
            val bringtogether = GermanAlphabet3(letter3[k], pronunciation3[k])
            germanAlphabetList.add(bringtogether)
        }
    }
}