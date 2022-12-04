package com.lauterbach.justspeak.German.GermanGrammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanPronoun1Adapter
import com.lauterbach.justspeak.data.GermanData.GermanPronounData

class GermanPronouns : AppCompatActivity() {

    lateinit var germanPronounList: ArrayList<GermanPronounData>
    lateinit var nominativ: Array<String>
    lateinit var akkusativ: Array<String>
    lateinit var dativ: Array<String>
    lateinit var gerProAdapter: GermanPronoun1Adapter
    lateinit var gerPronounCycle: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_german_pronouns)

        firstPronouns()

        val gerProAdapter = GermanPronoun1Adapter(germanPronounList)
        gerPronounCycle = findViewById(R.id.gerProRecycler1)
        gerPronounCycle.adapter = gerProAdapter
        gerPronounCycle.layoutManager = LinearLayoutManager(this)
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
}