package com.lauterbach.justspeak.German.GermanGrammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanDativeReflexiveAdapter
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanPronoun1Adapter
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanReflexiveAdapter
import com.lauterbach.justspeak.data.GermanData.GermanDativePronounData
import com.lauterbach.justspeak.data.GermanData.GermanPronounData
import com.lauterbach.justspeak.data.GermanData.GermanReflexivePronounData

class GermanPronouns : AppCompatActivity() {

    //first table
    lateinit var germanPronounList: ArrayList<GermanPronounData>
    lateinit var nominativ: Array<String>
    lateinit var akkusativ: Array<String>
    lateinit var dativ: Array<String>
    lateinit var gerProAdapter: GermanPronoun1Adapter
    lateinit var gerPronounCycle: RecyclerView

    //second table
    lateinit var gerAccProList: ArrayList<GermanReflexivePronounData>
    lateinit var pro: Array<String>
    lateinit var ref: Array<String>
    lateinit var exe: Array<String>
    lateinit var refAdapter: GermanReflexiveAdapter
    lateinit var gerAccRecycler: RecyclerView

    //third tables
    lateinit var gerDatProList: ArrayList<GermanDativePronounData>
    lateinit var datPro: Array<String>
    lateinit var datRef: Array<String>
    lateinit var datExa: Array<String>
    lateinit var datAdapter: GermanDativePronounData
    lateinit var gerDatRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_german_pronouns)

        //First table
        firstPronouns()
        val gerProAdapter = GermanPronoun1Adapter(germanPronounList)
        gerPronounCycle = findViewById(R.id.gerProRecycler1)
        gerPronounCycle.adapter = gerProAdapter
        gerPronounCycle.layoutManager = LinearLayoutManager(this)

        //Second table
        accReflexivePronoun()
        val refAdapter = GermanReflexiveAdapter(gerAccProList)
        gerAccRecycler = findViewById(R.id.gerProRecycler2)
        gerAccRecycler.adapter = refAdapter
        gerAccRecycler.layoutManager = LinearLayoutManager(this)

        //third table
        datReflexivePronoun()
        val datRefAdapter = GermanDativeReflexiveAdapter(gerDatProList)
        gerDatRecycler = findViewById(R.id.gerProRecycler3)
        gerDatRecycler.adapter = datRefAdapter
        gerDatRecycler.layoutManager = LinearLayoutManager(this)
    }

    fun firstPronouns() {

        germanPronounList = arrayListOf<GermanPronounData>()

        nominativ = arrayOf(
            getString(R.string.gerNom1),
            getString(R.string.gerNom2),
            getString(R.string.gerNom3),
            getString(R.string.gerNom4),
            getString(R.string.gerNom5),
            getString(R.string.gerNom6),
            getString(R.string.gerNom7),
            getString(R.string.gerNom8),
            getString(R.string.gerNom9)
        )
        akkusativ = arrayOf(
            getString(R.string.gerAcc1),
            getString(R.string.gerAcc2),
            getString(R.string.gerAcc3),
            getString(R.string.gerAcc4),
            getString(R.string.gerAcc5),
            getString(R.string.gerAcc6),
            getString(R.string.gerAcc7),
            getString(R.string.gerAcc8),
            getString(R.string.gerAcc9)
        )

        dativ = arrayOf(
            getString(R.string.gerDat1),
            getString(R.string.gerDat2),
            getString(R.string.gerDat3),
            getString(R.string.gerDat4),
            getString(R.string.gerDat5),
            getString(R.string.gerDat6),
            getString(R.string.gerDat7),
            getString(R.string.gerDat8),
            getString(R.string.gerDat9)
        )

        for(i in nominativ.indices) {
            val case = GermanPronounData(
                nominativ[i], akkusativ[i], dativ[i]
            )
            germanPronounList.add(case)
        }
    }

    fun accReflexivePronoun() {
        gerAccProList = arrayListOf<GermanReflexivePronounData>()

        pro = arrayOf(
            getString(R.string.ich),
            getString(R.string.du),
            getString(R.string.er_sie_es),
            getString(R.string.wir),
            getString(R.string.ihr),
            getString(R.string.sie)
        )

        ref = arrayOf(
            getString(R.string.mich),
            getString(R.string.dich),
            getString(R.string.sich),
            getString(R.string.uns),
            getString(R.string.euch),
            getString(R.string.sich)
        )

        exe = arrayOf(
            getString(R.string.gerAccProSen1),
            getString(R.string.gerAccProSen2),
            getString(R.string.gerAccProSen3),
            getString(R.string.gerAccProSen4),
            getString(R.string.gerAccProSen5),
            getString(R.string.gerAccProSen6)
        )
        for (j in pro.indices) {
            val fourth = GermanReflexivePronounData(
                pro[j], ref[j], exe[j]
            )
            gerAccProList.add(fourth)
        }
    }

    fun datReflexivePronoun() {

        gerDatProList = arrayListOf<GermanDativePronounData>()

        datPro = arrayOf(
            getString(R.string.ich),
            getString(R.string.du),
            getString(R.string.er_sie_es),
            getString(R.string.wir),
            getString(R.string.ihr),
            getString(R.string.sie)
        )

        datRef = arrayOf(
            getString(R.string.mir),
            getString(R.string.dir),
            getString(R.string.sich),
            getString(R.string.uns),
            getString(R.string.euch),
            getString(R.string.sich)
        )

        datExa = arrayOf(
            getString(R.string.gerDatSen1),
            getString(R.string.gerDatSen2),
            getString(R.string.gerDatSen3),
            getString(R.string.gerDatSen4),
            getString(R.string.gerDatSen5),
            getString(R.string.gerDatSen6)
        )
        for (k in datPro.indices) {
            val seventh = GermanDativePronounData(
                datPro[k], datRef[k], datExa[k]
            )
            gerDatProList.add(seventh)
        }
    }
}