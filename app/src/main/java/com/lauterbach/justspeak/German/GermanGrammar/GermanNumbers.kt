package com.lauterbach.justspeak.German.GermanGrammar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanNumber2Adapter
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanNumberAdapter
import com.lauterbach.justspeak.data.GermanData.GermanNumberData


class GermanNumbers : AppCompatActivity() {

    lateinit var germanNumberList: ArrayList<GermanNumberData>
    lateinit var gerNumber: Array<String>
    lateinit var gerPro: Array<String>
    lateinit var engNumber: Array<String>
    lateinit var adapter: GermanNumberAdapter
    lateinit var recyclerView: RecyclerView

    //second recyclerview
    lateinit var secondGermanList: ArrayList<GermanNumberData>
    lateinit var secondGerNo: Array<String>
    lateinit var secondGerPro: Array<String>
    lateinit var engNo: Array<String>
    lateinit var adapter2: GermanNumber2Adapter
    lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers_german)

        displayNumbers()
        showNumbers()

        val adapter = GermanNumberAdapter(germanNumberList)
        recyclerView = findViewById(R.id.GerNoRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter2 = GermanNumber2Adapter(secondGermanList)
        recyclerView2 = findViewById(R.id.GerNoRecycler2)
        recyclerView2.adapter = adapter2
        recyclerView2.layoutManager = LinearLayoutManager(this)
    }

    fun displayNumbers() {
        germanNumberList = arrayListOf<GermanNumberData>()

        gerNumber = arrayOf(
            getString(R.string.nool),
            getString(R.string.eins),
            getString(R.string.zwei),
            getString(R.string.drei),
            getString(R.string.vier),
            getString(R.string.funf),
            getString(R.string.sechs),
            getString(R.string.sieben),
            getString(R.string.acht),
            getString(R.string.neun),
            getString(R.string.zehn),
            getString(R.string.elf),
            getString(R.string.zwolf),
            getString(R.string.dreizehn),
            getString(R.string.vierzehn),
            getString(R.string.funfzehn),
            getString(R.string.sechzehn),
            getString(R.string.siebzehn),
            getString(R.string.achtzehn),
            getString(R.string.neunzehn),
            getString(R.string.zwangzig)
        )

        gerPro = arrayOf(
            getString(R.string.gerNoPro0),
            getString(R.string.gerNoPro1),
            getString(R.string.gerNoPro2),
            getString(R.string.gerNoPro3),
            getString(R.string.gerNoPro4),
            getString(R.string.gerNoPro5),
            getString(R.string.gerNoPro6),
            getString(R.string.gerNoPro7),
            getString(R.string.gerNoPro8),
            getString(R.string.gerNoPro9),
            getString(R.string.gerNoPro10),
            getString(R.string.gerNoPro11),
            getString(R.string.gerNoPro12),
            getString(R.string.gerNoPro13),
            getString(R.string.gerNoPro14),
            getString(R.string.gerNoPro15),
            getString(R.string.gerNoPro16),
            getString(R.string.gerNoPro17),
            getString(R.string.gerNoPro18),
            getString(R.string.gerNoPro19),
            getString(R.string.gerNoPro20)
        )
        engNumber = arrayOf(
            getString(R.string.zero),
            getString(R.string.one),
            getString(R.string.two),
            getString(R.string.three),
            getString(R.string.four),
            getString(R.string.five),
            getString(R.string.six),
            getString(R.string.seven),
            getString(R.string.eight),
            getString(R.string.nine),
            getString(R.string.ten),
            getString(R.string.eleven),
            getString(R.string.twelve),
            getString(R.string.thirteen),
            getString(R.string.fourteen),
            getString(R.string.fifteen),
            getString(R.string.sixteen),
            getString(R.string.seventeen),
            getString(R.string.eighteen),
            getString(R.string.nineteen),
            getString(R.string.twenty)
        )

        for(i in gerNumber.indices) {
            val deuNo = GermanNumberData(
                gerNumber[i], gerPro[i], engNumber[i],
            )
            germanNumberList.add(
                deuNo
            )
        }
    }

    fun showNumbers() {
        secondGermanList = arrayListOf<GermanNumberData>()

        secondGerNo = arrayOf(
            getString(R.string.einundzwanzig),
            getString(R.string.zweiundzwanzig),
            getString(R.string.dreiundzwanzig),
            getString(R.string.vierundzwanzig),
            getString(R.string.funfundzwanzig),
            getString(R.string.sechsundzwanzig),
            getString(R.string.siebenundzwanzig),
            getString(R.string.achtundzwanzig),
            getString(R.string.neunundzwanzig),
            getString(R.string.dreissig),
            getString(R.string.vierzig),
            getString(R.string.funfzig),
            getString(R.string.sechzig),
            getString(R.string.einhundert)
            )

        secondGerPro = arrayOf(
            getString(R.string.gerNoPro21),
            getString(R.string.gerNoPro22),
            getString(R.string.gerNoPro23),
            getString(R.string.gerNoPro24),
            getString(R.string.gerNoPro25),
            getString(R.string.gerNoPro26),
            getString(R.string.gerNoPro27),
            getString(R.string.gerNoPro28),
            getString(R.string.gerNoPro29),
            getString(R.string.gerNoPro30),
            getString(R.string.gerNoPro31),
            getString(R.string.gerNoPro32),
            getString(R.string.gerNoPro33),
            getString(R.string.gerNoPro34)
        )

        engNo = arrayOf(
            getString(R.string.twentyone),
            getString(R.string.twentytwo),
            getString(R.string.twentythree),
            getString(R.string.twentyfour),
            getString(R.string.twentyfive),
            getString(R.string.twentysix),
            getString(R.string.twentyseven),
            getString(R.string.twentyeight),
            getString(R.string.twentynine),
            getString(R.string.thirty),
            getString(R.string.forty),
            getString(R.string.fifty),
            getString(R.string.sixty),
            getString(R.string.onehundred)
        )

        for(j in secondGerNo.indices) {
            val duits = GermanNumberData(
                secondGerNo[j], secondGerPro[j], engNo[j]
            )
            secondGermanList.add(duits)
        }
    }
}