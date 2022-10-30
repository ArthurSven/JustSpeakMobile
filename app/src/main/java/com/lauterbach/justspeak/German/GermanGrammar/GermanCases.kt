package com.lauterbach.justspeak.German.GermanGrammar

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.DefiniteArtikelAdapter
import com.lauterbach.justspeak.adapters.GermanAdapters.IndefiniteArtikelAdapter
import com.lauterbach.justspeak.data.GermanData.GermanDefiniteData
import com.lauterbach.justspeak.data.GermanData.GermanIndefiniteData

class GermanCases : AppCompatActivity() {
    //Definite articles table stuff
    lateinit var bestimmteList: ArrayList<GermanDefiniteData>
    lateinit var case: Array<String>
    lateinit var masc: Array<String>
    lateinit var fem: Array<String>
    lateinit var neu: Array<String>
    lateinit var plu: Array<String>
    lateinit var adapter: DefiniteArtikelAdapter
    lateinit var recyclerView: RecyclerView

    //Indefinite articles table stuff
    lateinit var indefinitArtikelList: ArrayList<GermanIndefiniteData>
    lateinit var inCase: Array<String>
    lateinit var inMasc: Array<String>
    lateinit var inFem: Array<String>
    lateinit var inNeu: Array<String>
    lateinit var inPlu: Array<String>
    lateinit var adapter2: IndefiniteArtikelAdapter
    lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_case_german)

        displayDefiniteArticles()
        displayIndefiniteArtikel()

        val adapter = DefiniteArtikelAdapter(bestimmteList)
        recyclerView = findViewById(R.id.germanDefArtRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter2 = IndefiniteArtikelAdapter(indefinitArtikelList)
        recyclerView2 = findViewById(R.id.germanIndArtRecycler)
        recyclerView2.adapter = adapter2
        recyclerView2.layoutManager = LinearLayoutManager(this)
    }

    fun displayDefiniteArticles() {

        bestimmteList = arrayListOf<GermanDefiniteData>()
        case = arrayOf(
            getString(R.string.nom),
            getString(R.string.acc),
            getString(R.string.dat),
            getString(R.string.gen)
        )
        masc = arrayOf(
            getString(R.string.der),
            getString(R.string.den),
            getString(R.string.dem),
            getString(R.string.des)
        )
        fem = arrayOf(
            getString(R.string.die),
            getString(R.string.die),
            getString(R.string.der),
            getString(R.string.der)
        )
        neu = arrayOf(
            getString(R.string.das),
            getString(R.string.das),
            getString(R.string.dem),
            getString(R.string.des)
        )
        plu = arrayOf(
            getString(R.string.die),
            getString(R.string.die),
            getString(R.string.den),
            getString(R.string.der)
        )
        for(i in case.indices) {
            val defLoop = GermanDefiniteData(
                case[i], masc[i], fem[i], neu[i], plu[i]
            )
            bestimmteList.add(defLoop)
        }
    }

    fun displayIndefiniteArtikel() {
        indefinitArtikelList = arrayListOf<GermanIndefiniteData>()
        inCase = arrayOf(
            getString(R.string.nom),
            getString(R.string.acc),
            getString(R.string.dat),
            getString(R.string.gen)
        )
        inMasc = arrayOf(
            getString(R.string.ein),
            getString(R.string.einen),
            getString(R.string.einem),
            getString(R.string.eines)
        )
        inFem = arrayOf(
            getString(R.string.eine),
            getString(R.string.eine),
            getString(R.string.einer),
            getString(R.string.einer)
        )
        inNeu = arrayOf(
            getString(R.string.ein),
            getString(R.string.ein),
            getString(R.string.einem),
            getString(R.string.eines)
        )
        inPlu = arrayOf(
            getString(R.string.blank),
            getString(R.string.blank),
            getString(R.string.blank),
            getString(R.string.blank)
        )
        for(j in inCase.indices) {
            val inDefLoop = GermanIndefiniteData(
                inCase[j], inMasc[j], inFem[j], inNeu[j], inPlu[j]
            )
            indefinitArtikelList.add(inDefLoop)
        }
    }
}