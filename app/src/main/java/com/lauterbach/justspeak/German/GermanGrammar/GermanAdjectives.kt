package com.lauterbach.justspeak.German.GermanGrammar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanAdjectiveAdapter
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanDefiniteAdapter
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanIndefiniteAdapter
import com.lauterbach.justspeak.data.GermanData.GermanAdjectiveData
import com.lauterbach.justspeak.data.GermanData.GermanDefiniteData
import com.lauterbach.justspeak.data.GermanData.GermanIndefiniteData

class GermanAdjectives : AppCompatActivity() {

    //Adjective list variables
    lateinit var germanAdjectiveList: ArrayList<GermanAdjectiveData>
    lateinit var germanAdjective : Array<String>
    lateinit var englishAdjective : Array<String>
    lateinit var gerAdjectiveSentence : Array<String>
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: GermanAdjectiveAdapter

    //Definite article variables
    lateinit var germanArticleList: ArrayList<GermanDefiniteData>
    lateinit var germanDefCase: Array<String>
    lateinit var germanDefMasc: Array<String>
    lateinit var germanDefFem: Array<String>
    lateinit var germanDefNeu: Array<String>
    lateinit var germanDefPlu: Array<String>
    lateinit var recyclerview2: RecyclerView
    lateinit var adapter2: GermanDefiniteAdapter

    //Indefinite article variables
    lateinit var germanIndefiniteArticleList: ArrayList<GermanIndefiniteData>
    lateinit var gerIndArtCase: Array<String>
    lateinit var gerIndArtMasc: Array<String>
    lateinit var gerIndArtFem: Array<String>
    lateinit var gerIndArtNeu: Array<String>
    lateinit var gerIndArtPlu: Array<String>
    lateinit var recyclerview3: RecyclerView
    lateinit var adapter3: GermanDefiniteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adjectives_german)

        displayGermanAdjectives()
        displayArticles()
        indefiniteArticles()

        //Adjectives display
        val adapter = GermanAdjectiveAdapter(germanAdjectiveList)
        recyclerView = findViewById(R.id.germanAdjRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Definite Articles display
        val adapter2 = GermanDefiniteAdapter(germanArticleList)
        recyclerview2 = findViewById(R.id.germanDefRecycler)
        recyclerview2.adapter = adapter2
        recyclerview2.layoutManager = LinearLayoutManager(this)

        val adapter3 = GermanIndefiniteAdapter(germanIndefiniteArticleList)
        recyclerview3 = findViewById(R.id.germanIndefRecycler)
        recyclerview3.adapter = adapter3
        recyclerview3.layoutManager = LinearLayoutManager(this)

    }

    fun displayGermanAdjectives() {

        germanAdjectiveList = arrayListOf<GermanAdjectiveData>()

        germanAdjective = arrayOf(
            getString(R.string.alt),
            getString(R.string.jung),
            getString(R.string.gross),
            getString(R.string.klein),
            getString(R.string.schoen),
            getString(R.string.haesslich),
            getString(R.string.frueh),
            getString(R.string.spat),
            getString(R.string.leicht),
            getString(R.string.schwer),
            getString(R.string.neu),
            getString(R.string.langsam),
            getString(R.string.schnell),
            getString(R.string.lang),
            getString(R.string.kurz)

        )

        englishAdjective = arrayOf(
            getString(R.string.old),
            getString(R.string.young),
            getString(R.string.tall),
            getString(R.string.small),
            getString(R.string.beautiful),
            getString(R.string.ugly),
            getString(R.string.early),
            getString(R.string.late),
            getString(R.string.light),
            getString(R.string.heavy),
            getString(R.string.newly),
            getString(R.string.slow),
            getString(R.string.fast),
            getString(R.string.longen),
            getString(R.string.shortly)

        )

        gerAdjectiveSentence = arrayOf(
            getString(R.string.geradjsentence1),
            getString(R.string.geradjsentence2),
            getString(R.string.geradjsentence3),
            getString(R.string.geradjsentence4),
            getString(R.string.geradjsentence5),
            getString(R.string.geradjsentence6),
            getString(R.string.geradjsentence7),
            getString(R.string.geradjsentence8),
            getString(R.string.geradjsentence9),
            getString(R.string.geradjsentence10),
            getString(R.string.geradjsentence11),
            getString(R.string.geradjsentence12),
            getString(R.string.geradjsentence13),
            getString(R.string.geradjsentence14),
            getString(R.string.geradjsentence15)
        )

        for(i in germanAdjective.indices) {
            val match = GermanAdjectiveData(germanAdjective[i], englishAdjective[i], gerAdjectiveSentence[i])
            germanAdjectiveList.add(match)
        }
    }

    fun displayArticles() {

        germanArticleList = arrayListOf<GermanDefiniteData>()

        germanDefCase = arrayOf(
            getString(R.string.nom),
            getString(R.string.acc),
            getString(R.string.dat),
            getString(R.string.gen)
        )

        germanDefMasc = arrayOf(
            getString(R.string.e2),
            getString(R.string.en),
            getString(R.string.en),
            getString(R.string.en)
        )

        germanDefFem = arrayOf(
            getString(R.string.e2),
            getString(R.string.e2),
            getString(R.string.en),
            getString(R.string.en)
        )

        germanDefNeu = arrayOf(
            getString(R.string.e2),
            getString(R.string.e2),
            getString(R.string.en),
            getString(R.string.en)
        )

        germanDefPlu = arrayOf(
            getString(R.string.en),
            getString(R.string.en),
            getString(R.string.en),
            getString(R.string.en)
        )

        for(j in germanDefCase.indices) {
            val bring = GermanDefiniteData(
                germanDefCase[j], germanDefMasc[j],
                germanDefFem[j], germanDefNeu[j],
                germanDefPlu[j])
            germanArticleList.add(bring)
        }
    }

    fun indefiniteArticles() {

        germanIndefiniteArticleList = arrayListOf <GermanIndefiniteData>()

        gerIndArtCase = arrayOf(
            getString(R.string.nom),
            getString(R.string.acc),
            getString(R.string.dat),
            getString(R.string.gen)
        )

        gerIndArtMasc = arrayOf(
            getString(R.string.er1),
            getString(R.string.en),
            getString(R.string.en),
            getString(R.string.en)
        )

        gerIndArtFem = arrayOf (
            getString(R.string.e2),
            getString(R.string.e2),
            getString(R.string.en),
            getString(R.string.en)
                )

        gerIndArtNeu = arrayOf (
            getString(R.string.es),
            getString(R.string.es),
            getString(R.string.en),
            getString(R.string.en)
        )

        gerIndArtPlu = arrayOf (
            getString(R.string.en),
            getString(R.string.en),
            getString(R.string.en),
            getString(R.string.en)
        )

        for(k in gerIndArtCase.indices) {
            val bring1 = GermanIndefiniteData(
                gerIndArtCase[k], gerIndArtMasc[k],
                gerIndArtFem[k], gerIndArtNeu[k],
                gerIndArtPlu[k])
            germanIndefiniteArticleList.add(bring1)
        }
    }
}